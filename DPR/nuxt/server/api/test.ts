export default defineEventHandler((event) =>  {

    // const {req, res} = event.node

    // 获取参数
    const query = getQuery(event)

    return {
        status: 1,
        msg: 'success'
    }
})