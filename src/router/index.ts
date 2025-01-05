import { createRouter, createWebHistory } from 'vue-router';
import type { RouteRecordRaw } from 'vue-router'; // 使用类型导入

// 导入页面组件
import AlittleTea from '@/views/alittletea.vue'
import BeforeLogin from '@/views/before-login.vue'
import Business from '@/views/business.vue'
import BusinessList from '@/views/businessList.vue'
import ConfirmOrder from '@/views/confirmOrder.vue'
import Index from '@/views/index.vue'
import LoginByPwd from '@/views/LoginByPwd.vue'
import Market from '@/views/market.vue'
import Message from '@/views/message.vue'
import Order from '@/views/order.vue'
import Personal from '@/views/personal.vue'
import Shopping from '@/views/shopping.vue'
import LoginByCaptcha from "@/views/LoginByCaptcha.vue";


// 创建路由
const routes: Array<RouteRecordRaw> = [
  { path: '/index', component: Index },
  { path: '/alittletea', component: AlittleTea },
  { path: '/before-login', component: BeforeLogin },
  { path: '/business', component: Business },
  { path: '/business-list', component: BusinessList },
  { path: '/confirmOrder', component: ConfirmOrder },
  { path: '/loginbypwd', component: LoginByPwd },
  { path: '/', component: LoginByCaptcha },
  { path: '/market', component: Market },
  { path: '/message', component: Message },
  { path: '/order', component: Order },
  { path: '/personal', component: Personal },
  { path: '/shopping', component: Shopping },
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
  scrollBehavior() {
    return { top: 0 };
  },
});

export default router;