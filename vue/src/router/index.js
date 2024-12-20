import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {path: '/',redirect:'/manager/home'},
    {path: '/manager',
      component:()=>import('@/views/App.vue'),
      children:[
          {path: 'home', meta: {name: "系统首页"}, component: () => import('@/views/manager/Home.vue'),}
      ]
    },
    {path: '/front',
      component:()=>import('@/views/manager/Front.vue'),
      children:[
        {path: 'home', meta: {name: "系统前台"}, component: () => import('@/views/Front/Home.vue'),}
      ]
    },
    {
      path:'/test',
      component:()=>import('@/views/Test/Home.vue'),
    },
    {path:'/404',component: () => import('@/views/manager/404.vue') },
    {path:'/:pathMatch(.*)',redirect:'/404'}
  ],
})

export default router
