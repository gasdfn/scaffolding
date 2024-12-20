# 日志

这边写下我在编写代码的过程中出现的错误

## 1、

没有在style 处加上 scoped 导致样式被覆盖了做不出白色

## 2

图标el.icon 未能够正常显示的问题。
在main.js 中的
```sh
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
app.component(key, component)
}
```
需要摆在import 和 App.use之间

## 3

```
el-menu  :default-active="this.$route.path"
```
### 4

```sh
main.js
# 处没有import  index.scss的样式
import 'element-plus/theme-chalk/src/index.scss'

```

### Compile and Minify for Production

```sh
npm run build
```
