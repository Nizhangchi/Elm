<script setup lang="ts">
import { useRouter } from 'vue-router';

const router = useRouter();
const indexIcon = () => {
  router.push('/index')
}
const shoppingIcon = () => {
  router.push('/shopping')
}
const messageIcon = () => {
  router.push('/message')
}
const personalIcon = () => {
  router.push('/personal')
}
const marketIcon = () => {
  router.push('/market')
}
</script>

<template>
  <body>
  <div class="total">
    <div class="header">
      <div class="news_text">消息中心</div>
      <div class="clear">
        <i class="fas fa-broom"></i>
      </div>
      <div class="setting">
        <i class="fas fa-cog"></i>
      </div>
    </div>

    <div class="platform_header">
      <div class="text"></div>
      <div class="left_text">平台消息</div>
      <div class="right_text">查看全部  ></div>
    </div>

    <div class="platform_news">
      <div class="card">
        <div class="businessPicture">
          <img style="margin-top:2vw;width: 40%;margin-left: 2vw" src="../assets/img/TypeImg/platform_picture2.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">杨梅，水蜜桃，阳光玫瑰上市啦</div>
            <div class="time">11分钟前</div>
          </div>
          <div class="message-content">杨梅12.9起，阳光玫瑰9.9起，水蜜桃9...</div>
        </div>
      </div>
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/TypeImg/platform_picture2.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">你附近有趋势爆款！</div>
            <div class="time">13:12</div>
          </div>
          <div class="message-content">近期热卖！附近3.8k+人都在买</div>
        </div>
      </div>
    </div>

    <div class="chat_header">聊天动态</div>

    <div class="chat_body">
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/TypeImg/rider.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">骑手孙董</div>
            <div class="time">周三18:22</div>
          </div>
          <div class="message-content">骑手:[图片]</div>
        </div>
      </div>
      <div class="divider"></div> <!-- 添加分割线 -->
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/business/yaojiwang.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">窑鸡王（昆明春融街店）</div>
            <div class="time">周日19:14</div>
          </div>
          <div class="message-content">诚邀收藏店铺粉丝入群</div>
        </div>
      </div>
      <div class="divider-2">
        <span>两周前的消息</span> <!-- 添加带文本的分割线 -->
      </div><!-- 添加两周前消息提醒 -->
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/TypeImg/rider.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">骑手杨健富</div>
            <div class="time">12月20日</div>
          </div>
          <div class="message-content">
            <div style="color: #00A6EB" class="message-content-1">[骑手@你]</div>
            <div class="message-content-2">[您对本次服务满意吗？]</div>
          </div>
        </div>
      </div>
      <div class="divider"></div> <!-- 添加分割线 -->
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/TypeImg/rider.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">骑手李杰</div>
            <div class="time">12月14日</div>
          </div>
          <div class="message-content">骑手:[图片]</div>
        </div>
      </div>
      <div class="divider"></div> <!-- 添加分割线 -->
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/business/cbd.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">茶百道（北湖万秀村店）</div>
            <div class="time">12月4日</div>
          </div>
          <div class="message-content">诚邀您加入粉丝福利群</div>
        </div>
      </div>
      <div class="divider"></div> <!-- 添加分割线 -->
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/TypeImg/rider.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">骑手卢盛才</div>
            <div class="time">12月4日</div>
          </div>
          <div class="message-content">[卡片消息]</div>
        </div>
      </div>
      <div class="divider"></div> <!-- 添加分割线 -->
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/TypeImg/rider.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">骑手符宗跃</div>
            <div class="time">10月20日</div>
          </div>
          <div class="message-content">骑手:[图片]</div>
        </div>
      </div>
      <div class="divider"></div> <!-- 添加分割线 -->
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/TypeImg/rider.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">骑手刘路</div>
            <div class="time">10月6日</div>
          </div>
          <div class="message-content">骑手:劳烦您动动小手给点个好评，感谢！</div>
        </div>
      </div>
      <div class="divider"></div> <!-- 添加分割线 -->
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/business/mxbc.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">蜜雪冰城（海伦家园店）</div>
            <div class="time">8月5日</div>
          </div>
          <div class="message-content">诚邀您加入粉丝福利群</div>
        </div>
      </div>
      <div class="divider"></div> <!-- 添加分割线 -->
      <div class="card">
        <div class="businessPicture">
          <img style="width: 40%;margin-left: 2vw" src="../assets/img/TypeImg/rider.jpg">
        </div>
        <div class="card-content">
          <div class="text">
            <div class="title">骑手吴甲威</div>
            <div class="time">2023年12月8日</div>
          </div>
          <div class="message-content">[您对本次外卖服务满意吗？]</div>
        </div>
      </div>
    </div>
    <div class="blank"> </div>
    <div class="footer">
      <div @click="indexIcon">
        Ⓜ️
        <p>首页</p>
      </div>
      <div @click="marketIcon">
        🏪
        <p>全能超市</p>
      </div>
      <div @click="messageIcon"  class="selected">
        💬
        <p>消息</p>
      </div>
      <div @click="shoppingIcon">
        🛒
        <p>购物车</p>
      </div>
      <div @click="personalIcon">
        ⚪
        <p>我的</p>
      </div>
    </div>
  </div>
  </body>
</template>

<style scoped>
.total{
  width: 100%;
  height: 100%;
}

/*顶部样式*/
.total .header{
  width: 100%;
  display: flex;
  flex-direction: row;
  background-color:#f5fcfc;
  height: 12vw;
  align-items: center;
  position: fixed;
}
.total .header .news_text{
  margin-left: 4vw;
  font-size: 6vw;
  color: black;
  flex:8;
  font-weight: bold;
}
.total .header .clear{
  margin-right: 2vw;
  font-size: 6vw;
  flex: 1;
  cursor: pointer;
}
.total .header .setting{
  margin-right: 4vw;
  flex: 1;
  font-size: 6vw;
  cursor: pointer;
}

/*平台消息顶部样式*/
.total .platform_header{
  width: 100%;
  height: 10vw;
  display: flex;
  flex-direction: row;
  background-color: #f5fcfc;
  padding-top: 15vw;
  margin-bottom: 4vw;
}
.total .platform_header .left_text{
  margin-left: 5vw;
  font-size: 4.5vw;
  flex:6;
  font-weight: bold;
}
.total .platform_header .right_text{
  font-size: 3.5vw;
  color: #999999;
  flex:2;
  cursor: pointer;
  margin-top: 1vw;
}

/*平台消息样式*/
.total .platform_news{
  width: 100%;
  flex-direction: column;
  background-color: #f5fcfc;
  height: 52vw;
}
.total .platform_news .card {
  width: 93%;
  height: 24vw;
  margin-left: 3vw;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  background-color: white;
  border-radius: 10px;
  border: 1px solid white;
  margin-bottom: 10px;
  overflow: hidden; /*保持整洁*/
}

.total .platform_news .card .card-content {
  flex: 7;
  margin-left: -15vw;
}

.total .platform_news .card .card-content .text {
  margin-bottom: 5px;
  display: flex;
  flex-direction: row;
}
.total .platform_news .card .card-content .text .title{
  font-weight: bold;
  flex: 4;
}
.total .platform_news .card .card-content .text .time{
  flex: 1;
  font-size: 3.2vw;
  color: #999999;
  text-align: right;/*文本右对齐*/
  margin-right: 3vw;
}
.total .platform_news .card .card-content .message-content {
  color: #999999;
  font-size: 3.7vw;
}

/*聊天动态标题*/
.total .chat_header{
  background-color: #f5fcfc;
  height: 8vw;
  margin-left: 5vw;
  font-size: 4.5vw;
  font-weight: bold;
}
/*聊天消息样式*/
.total .chat_body{
  width: 100%;
  flex-direction: column;
  background-color: #f5fcfc;
}
.total .chat_body .card{
  width: 93%;
  height: 22vw;
  margin-left: 3vw;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  background-color: white;
  border-radius: 10px;
  border: 1px solid white;
  overflow: hidden; /*保持整洁*/
}
.total .chat_body .card .card-content {
  flex: 7;
  margin-left: -15vw;
}

.total .chat_body .card .card-content .text {
  margin-bottom: 5px;
  display: flex;
  flex-direction: row;
}
.total .chat_body .card .card-content .text .title{
  font-weight: bold;
  flex: 4;
}
.total .chat_body .card .card-content .text .time{
  flex: 2;
  font-size: 3.2vw;
  color: #999999;
  text-align: right;/*文本右对齐*/
  margin-right: 3vw;
}

.total .chat_body .card .card-content .message-content {
  color: #999999;
  font-size: 3.7vw;
  display: flex;
  flex-direction: row;
}

.total .chat_body .card .card-content .message-content-1 ,
.total .chat_body .card .card-content .message-content-2 {
  color: #999999;
  font-size: 3.7vw;
}
.total .chat_body .divider {
  width: 75%;
  height: 0.6px;
  background-color: #e0e0e0;
  margin-left: 70px;
}
.total .chat_body .divider-2{
  width: 90%;
  height: 1px;
  background-color: lightgray;
  display: flex;
  align-items: center;
  justify-content: center;
  margin-left: 5vw;
}

.total .chat_body .divider-2 span {
  padding: 0 5px; /* 调整文本与分割线之间的间距 */
  color: lightgray; /* 文本颜色 */
  justify-content: center;
  background-color: white;
  font-size: 3.2vw;
}
.total .blank{
  height: 20vw;
  background-color: #f5fcfc;
}
/*底部样式*/
.total .footer {
  width: 100%;
  height: 13vw;
  border-top: solid 1px #DDD;
  z-index: 99;
  position: fixed;
  left: 0;
  bottom: 0;
  font-size: 25px;
  display: flex;
  justify-content: space-around;
  align-items: center;
  background-color: white;
}
.total .footer p{
  margin-bottom: 3vw;
}
.total .footer div {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  color: #999999;
  cursor: pointer;
  user-select: none;
  padding-top: 4vw;
}
.total .footer .selected{
  color: #17BAF9;
}
.total .footer div p {
  font-size: 2.8vw;
}

.total .footer div i {
  font-size: 6vw;
}

</style>