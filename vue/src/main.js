import { createApp } from 'vue'
import App from './views/manager/Manager.vue'
import router from './router'
import '@/assets/css/global.css'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import 'element-plus/theme-chalk/src/index.scss'
import zhCn from 'element-plus/es/locale/lang/zh-cn'



const app = createApp(App)

for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}

app.use(router)
app.use(ElementPlus,{local:zhCn})
app.mount('#app')



