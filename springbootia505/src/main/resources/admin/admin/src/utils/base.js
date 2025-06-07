const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootia505/",
            name: "springbootia505",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootia505/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线办公小程序"
        } 
    }
}
export default base
