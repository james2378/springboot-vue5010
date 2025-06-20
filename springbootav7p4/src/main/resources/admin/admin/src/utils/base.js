const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootav7p4/",
            name: "springbootav7p4",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "基于JAVA的企业内部人员绩效量化管理系统"
        } 
    }
}
export default base
