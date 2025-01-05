import '@unocss/reset/tailwind.css'
import 'virtual:uno.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'
// 引入 normalize.css
import 'D://WebStorm 2023.3.4/project/demo001/node_modules/normalize.css/normalize.css'

// 引入 fontawesome-free 的 CSS
import 'D://WebStorm 2023.3.4/project/demo001/node_modules/fontawesome-free/css/all.css';
import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(createPinia())
app.use(router)

app.mount('#app')
