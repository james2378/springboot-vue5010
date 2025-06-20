import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuangongxinchou from '@/views/modules/yuangongxinchou/list'
    import yuangong from '@/views/modules/yuangong/list'
    import qingjiashenqing from '@/views/modules/qingjiashenqing/list'
    import jinshengxinxi from '@/views/modules/jinshengxinxi/list'
    import jiangchengxinxi from '@/views/modules/jiangchengxinxi/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import yuangongjixiao from '@/views/modules/yuangongjixiao/list'
    import yuangongkaoqin from '@/views/modules/yuangongkaoqin/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuangongxinchou',
        name: '员工薪酬',
        component: yuangongxinchou
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/qingjiashenqing',
        name: '请假申请',
        component: qingjiashenqing
      }
      ,{
	path: '/jinshengxinxi',
        name: '晋升信息',
        component: jinshengxinxi
      }
      ,{
	path: '/jiangchengxinxi',
        name: '奖惩信息',
        component: jiangchengxinxi
      }
      ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
      ,{
	path: '/yuangongjixiao',
        name: '员工绩效',
        component: yuangongjixiao
      }
      ,{
	path: '/yuangongkaoqin',
        name: '员工考勤',
        component: yuangongkaoqin
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
