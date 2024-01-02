<template>
  <div class="wrapper">
    <el-form ref="loginRef" :model="loginForm" :rules="loginRules"  class="form">
      <div class="header">动态个人简历管理系统</div>
      <div class="main">
        <el-form-item>
          <div class="inpbox username">
            <input v-model="loginForm.username" type="text" placeholder="username">
          </div>
        </el-form-item>
        <el-form-item>
          <div class="inpbox password">
            <input v-model="loginForm.password" :type="showPassword ? 'text' : 'password'" placeholder="username">
          </div>
        </el-form-item>
        <el-form-item>
          <div class="inpbox code">
            <input v-model="loginForm.code" type="text" placeholder="验证码">
            <div class="code-img">
              <img :src="codeUrl" @click="getCode"/>
            </div>
          </div>
        </el-form-item>
      </div>
      <div class="active">
        <div class="btn" @click.prevent="handleLogin">
          <span v-if="!loading">登 录</span>
          <span v-else>登 录 中...</span>
        </div>
      </div>
      <div style="float: right;" v-if="register">
        <router-link class="link-type" :to="'/register'">立即注册</router-link>
      </div>
    </el-form>
  </div>
</template>

<script setup>
import { getCodeImg } from "@/api/login";
import Cookies from "js-cookie";
import { encrypt, decrypt } from "@/utils/jsencrypt";
import useUserStore from '@/store/modules/user'

const userStore = useUserStore()
const route = useRoute();
const router = useRouter();
const { proxy } = getCurrentInstance();

const loginForm = ref({
  username: "admin",
  password: "admin123",
  rememberMe: false,
  code: "",
  uuid: ""
});

const loginRules = {
  username: [{ required: true, trigger: "blur", message: "请输入您的账号" }],
  password: [{ required: true, trigger: "blur", message: "请输入您的密码" }],
  code: [{ required: true, trigger: "change", message: "请输入验证码" }]
};

const codeUrl = ref("");
const loading = ref(false);
// 验证码开关
const captchaEnabled = ref(true);

const showPassword = ref(false);
// 注册开关
const register = ref(false);
const redirect = ref(undefined);

watch(route, (newRoute) => {
    redirect.value = newRoute.query && newRoute.query.redirect;
}, { immediate: true });

function handleLogin() {
  proxy.$refs.loginRef.validate(valid => {
    if (valid) {
      loading.value = true;
      // 勾选了需要记住密码设置在 cookie 中设置记住用户名和密码
      if (loginForm.value.rememberMe) {
        Cookies.set("username", loginForm.value.username, { expires: 30 });
        Cookies.set("password", encrypt(loginForm.value.password), { expires: 30 });
        Cookies.set("rememberMe", loginForm.value.rememberMe, { expires: 30 });
      } else {
        // 否则移除
        Cookies.remove("username");
        Cookies.remove("password");
        Cookies.remove("rememberMe");
      }
      // 调用action的登录方法
      userStore.login(loginForm.value).then(() => {
        const query = route.query;
        const otherQueryParams = Object.keys(query).reduce((acc, cur) => {
          if (cur !== "redirect") {
            acc[cur] = query[cur];
          }
          return acc;
        }, {});
        router.push({ path: redirect.value || "/", query: otherQueryParams });
      }).catch(() => {
        loading.value = false;
        // 重新获取验证码
        if (captchaEnabled.value) {
          getCode();
        }
      });
    }
  });
}

function getCode() {
  getCodeImg().then(res => {
    captchaEnabled.value = res.captchaEnabled === undefined ? true : res.captchaEnabled;
    if (captchaEnabled.value) {
      codeUrl.value = "data:image/gif;base64," + res.img;
      loginForm.value.uuid = res.uuid;
    }
  });
}

function getCookie() {
  const username = Cookies.get("username");
  const password = Cookies.get("password");
  const rememberMe = Cookies.get("rememberMe");
  loginForm.value = {
    username: username === undefined ? loginForm.value.username : username,
    password: password === undefined ? loginForm.value.password : decrypt(password),
    rememberMe: rememberMe === undefined ? false : Boolean(rememberMe)
  };
}

getCode();
getCookie();
</script>

<style lang='scss' scoped>
  * {
    margin: 0;
    padding: 0;
  }

  .wrapper {
    width: 100vw;
    height: 100vh;

    display: flex;
    justify-content: center;
    align-items: center;

    //background: url("../assets/images/login-background.jpg");

    .form {
      width: 30vw;
      min-width: 500px;
      //background: rgb(41, 45, 62);
      background: rgba(0, 0, 0, 0.5);
      color: #fff;
      border-radius: 10px;
      padding: 50px 80px 80px;

      box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.4);

      .header {
        position: relative;
        text-align: center;
        font-size: 35px;
        line-height: 100px;

        &:before {
          content: "";
          position: absolute;
          left: -10%;
          bottom: 25px;
          width: 120%;
          height: 4px;
          background: #fff;
        }
      }

      .main .inpbox {
        width: 100%;
        height: 50px;
        background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
        background-size: 400%;
        margin-bottom: 20px;
        border-radius: 30px;

        padding: 3px;

        display: flex;
        justify-content: center;
        align-items: center;
        transition: all .3s;

        input {
          background-color: rgb(41, 45, 62);
          border: 0;
          border-radius: 30px;
          //width: calc(100% - 4px);
          //height: calc(100% - 5px);
          width: 100%;
          height: 100%;
          text-align: center;
          font-size: 15px;
          color: #fff;
          outline: none;
        }

        &.code {
          //display: flex;

          position: relative;

          input {
            //flex: 1;
            //border-radius: 30px 0 0 30px;
          }

          .code-img {
            position: absolute;
            right: 3px;
            top: 3px;

            height: calc(100% - 6px);
            overflow: hidden;
            border-radius: 0 30px 30px 0;

            img {
              height: 100%;
              cursor: pointer;
            }
          }
        }
      }

      .active {
        display: flex;
        justify-content: center;

        .btn {
          width: 60%;
          //border: 2px solid #409EFF;
          box-shadow: 0 5px 15px rgba(255, 255, 255, .25);
          //background: rgba(255, 255, 255, .25);
          background: linear-gradient(90deg, #03a9f4, #f441a5);
          text-align: center;
          line-height: 50px;
          border-radius: 30px;
          cursor: pointer;
          transition: all .3s;

          &:hover {
            transform: scale(1.2);
            //background-color: #409EFF;
          }
        }
      }
    }
  }

  // 动画
  .main .inpbox:has(input:focus) {
    animation: animate 5s linear infinite;
    transform: scale(1.2);
  }

  @keyframes animate {
    0% {
      background-position: 0 0;
    }
    100% {
      background-position: 400% 0;
    }
  }

</style>
