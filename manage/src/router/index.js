// import { resolve } from 'core-js/fn/promise'
import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

export default new VueRouter({
  routes:[
    {
      path:'/',
      component:resolve => require(['../pages/Login.vue'],resolve)
    },
    {
      path:'/Home',
      component:resolve => require(['../components/Home.vue'],resolve),
      children:[
        {
          path: '/Info',
          component: resolve => require(['../pages/InfoPage.vue'], resolve)
        },
      ]
    }
  ]
})
