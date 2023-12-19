// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  devtools: { enabled: true },
  // @ts-ignore
  app: {
    head: {
      title: 'Zero的个人简历',
      charset: 'utf-8',
      viewport: 'width=device-width, initial-scale=1',
    }
  }
})
