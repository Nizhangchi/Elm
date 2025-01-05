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
const ordersIcon = () => {
  router.push('/order')
}

</script>

<template>
  <body>
  <div class="total">
    <div class="header">
      <div class="avatar">
        <img class="photo" src="../assets/img/avatar.jpg" >
        <div class="grade">
          <div class="grade-icon">👑</div>
          <div class="grade-text">黄金会员</div>
        </div>
      </div>
      <div class="header-content">
        <div class="name">
          Nizhangchi <i class="fas fa-cog"></i>
        </div>
        <div class="privilege">
          <div class="privilege-text">6月会员特权已到账</div>
          <div class="get">去领取</div>
        </div>
      </div>

    </div>
    <div class="body1" >
      <div class="card">
        <div class="content">
          <img style="width: 35%" class="picture" src="../assets/img/vipcard.png" >
          <div class="content-item">超级吃货卡</div>
          <div class="item-detail"><span style="color:red;">1</span>张红包可用</div>
        </div>
        <div class="content">
          <img style="width:30%" class="picture" src="../assets/img/dou.png" >
          <div class="content-item">吃货豆</div>
          <div class="item-detail"><span style="color:red;">1161</span>豆可用</div>
        </div>
        <div class="content">
          <img style="width: 30%" class="picture" src="../assets/img/redpacket.png" >
          <div class="content-item">红包</div>
          <div class="item-detail"><span style="color:red;">19</span>张可用</div>
        </div>
      </div>
    </div>
    <div class="body">
      <div class="card">
        <div class="title">我的订单</div>
        <div class="content">
          <div class="items" @click="ordersIcon">
            <img style="width: 28%" class="picture1" src="../assets/img/order.png" >
            <div class="content-item">全部</div>
          </div>
          <div class="items">
            <img class="picture1" src="../assets/img/coming.png" >
            <div class="content-item">进行中</div>
          </div>
          <div class="items">
            <img style="width: 40%" class="picture1" src="../assets/img/assess.png" >
            <div class="content-item">待评价</div>
          </div>
          <div class="items">
            <img class="picture1" src="../assets/img/refund.png" >
            <div class="content-item">退款</div>
          </div>
        </div>
      </div>
      <div class="card">
        <div class="title">
          <div class="left-title">我的钱包</div>
          <div class="right-title">进入 ></div>
        </div>
        <div class="content">
          <div class="items">
            <img class="picture2" src="../assets/img/money1.png" >
            <div class="content-item">借钱</div>
          </div>
          <div class="items">
            <img class="picture2" src="../assets/img/money2.png" >
            <div class="content-item">钱包余额</div>
          </div>
          <div class="items">
            <img class="picture2" src="../assets/img/money3.png" >
            <div class="content-item">外卖红包</div>
          </div>
          <div class="items">
            <img style="width: 40%" class="picture2" src="../assets/img/money4.png" >
            <div class="content-item">现金奖励</div>
          </div>
        </div>
      </div>
      <div class="card" style="height: 50vw;">
        <div class="title">互动中心</div>
        <div class="content" style="flex-wrap: wrap">
          <div class="items">
            <img class="picture3" src="../assets/img/1.png" >
            <div class="content-item">闯关赢大奖</div>
          </div>
          <div class="items">
            <img class="picture3" src="../assets/img/2.png" >
            <div class="content-item">游乐园</div>
          </div>
          <div class="items">
            <img class="picture3" src="../assets/img/3.png" >
            <div class="content-item">天天赚现金</div>
          </div>
          <div class="items">
            <img class="picture3" src="../assets/img/4.png" >
            <div class="content-item">0元夺宝</div>
          </div>
          <div class="items">
            <img class="picture3" src="../assets/img/5.png" >
            <div class="content-item">斗地主大赛</div>
          </div>
          <div class="items">
            <img class="picture3" src="../assets/img/6.png" >
            <div class="content-item">饭搭子</div>
          </div>
          <div class="items">
            <img class="picture3" src="../assets/img/7.png" >
            <div class="content-item">福尔魔方</div>
          </div>
          <div class="items">
            <img class="picture3" src="../assets/img/8.png" >
            <div class="content-item">合成甜蜜蜜</div>
          </div>
        </div>
      </div>
      <div class="card" style="height: 50vw;">
        <div class="title">更多功能</div>
        <div class="content" style="flex-wrap: wrap">
          <div class="items">
            <img class="picture4" src="../assets/img/9.png" >
            <div class="content-item">我的地址</div>
          </div>
          <div class="items">
            <img class="picture4" src="../assets/img/10.png" >
            <div class="content-item">店铺关注</div>
          </div>
          <div class="items">
            <img class="picture4" src="../assets/img/11.png" >
            <div class="content-item">我的公益</div>
          </div>
          <div class="items">
            <img class="picture4" src="../assets/img/12.png" >
            <div class="content-item">发票助手</div>
          </div>
          <div class="items">
            <img class="picture4" src="../assets/img/13.png" >
            <div class="content-item">我的客服</div>
          </div>
          <div class="items">
            <img class="picture4" src="../assets/img/14.png" >
            <div class="content-item">邀友跑单</div>
          </div>
          <div class="items">
            <img class="picture4" src="../assets/img/15.png" >
            <div class="content-item">我的账单</div>
          </div>
          <div class="items">
            <img class="picture4" src="../assets/img/16.png" >
            <div class="content-item">评价中心</div>
          </div>
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
      <div @click="messageIcon">
        💬
        <p>消息</p>
      </div>
      <div @click="shoppingIcon">
        🛒
        <p>购物车</p>
      </div>
      <div @click="personalIcon" class="selected">
        ⚪
        <p>我的</p>
      </div>
    </div>
  </div>
  </body>
</template>

<style scoped>
.total{
  height: 100%;
  width: 100%;
  background-color: #f5fcfc;
}
/*顶部样式*/
.total .header{
  display: flex;
  flex-direction: row;
  align-items: center;
  height: 28vw;
  background-color: #f4efcf;
}
.total .header .avatar{
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-left: 5vw;
}
.total .header .avatar .photo{
  width: 15vw;
  border-radius: 20px;
  cursor: pointer;
}
.total .header .avatar .grade{
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  margin-top: -3vw;
  color: #dfd17a;
  background-color: #52546c;
  border-radius: 5px;
  font-size: 3.5vw;
  height: 5vw;
  width: 20vw;
}
.total .header .header-content{
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  margin-left: 3vw;
}
.total .header .header-content .name{
  display: flex;
  font-size: 4.5vw;
  font-weight: bolder;
}
.total .header .header-content .name i{
  margin-left: auto;
  font-size: 5vw;
  margin-right: 3vw;
  cursor: pointer;
}
.total .header .header-content .privilege{
  display: flex;
  flex-direction: row;
  margin-top: 5vw;
  align-items: center;
}
.total .header .header-content .privilege .privilege-text{
  text-align: left;
  font-size: 3.5vw;
  color: #3b3442;
}
.total .header .header-content .privilege .get{
  border-radius: 8px;
  display: flex;
  flex-direction: row;
  color: #dce3ed;
  background-color: #585d72;
  font-size: 3vw;
  height: 5vw;
  width: 11vw;
  align-items: center;
  justify-content: center;
  margin-left: 2vw;
  cursor: pointer;
}

/*首栏*/
.total .body1{
  display: flex;
  flex-direction: column;
  align-items: center;
  background:linear-gradient(#f4efcf 20%,#f5fcfc 80%)
}
.total .body1 .card{
  width: 90%;
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  background-color: white;
  border-radius: 13px;
  height: 30vw;
  margin-bottom: 3vw;
}
.total .body1 .card .title {
  font-size: 4.5vw;
  font-weight: bolder;
}
.total .body1 .card .content{
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}
.total .body1 .card .content .picture {
  cursor: pointer;
}
.total .body1 .card .content .content-item{
  font-weight: bolder;
  font-size: 4vw;
  margin-top: 2vw;
}
.total .body1 .card .content .item-detail{
  font-size: 3.3vw;
  margin-top: 2vw;
  color:#666666;
}

/*body样式*/

.total .body{
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: #f5fcfc;
}
.total .body .card{
  width: 90%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  background-color: white;
  border-radius: 13px;
  height: 30vw;
  margin-bottom: 3vw;
}
.total .body .card .title {
  display: flex;
  flex-direction: row;
  align-items: center;
  font-size: 4.5vw;
  font-weight: bolder;
  margin-left: 3vw;
  margin-top: 1vw;
  margin-bottom: -2vw;
}
.total .body .card .title .right-title{
  color: #999999;
  font-size: 3.8vw;
  margin-left: auto;
  margin-right: 3vw;
  font-weight: normal;
  cursor: pointer;
}
.total .body .card .content{
  margin-top: 3vw;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-around;
}
.total .body .card .content .items{
  display: flex;
  flex-direction: column;
  align-items: center;
  flex-basis: 25%;
}
.total .body .card .content .items .picture1{
  width: 33%;
  cursor: pointer;
  padding-top: 1vw;
}
.total .body .card .content .items .picture2{
  width: 55%;
  cursor: pointer;
  padding-top: 1vw;
}
.total .body .card .content .items .picture3{
  width: 50%;
  cursor: pointer;
  padding-top: 1vw;
}
.total .body .card .content .items .picture4{
  width: 40%;
  cursor: pointer;
  padding-top: 1vw;
}
.total .body .card .content .items .content-item{
  font-size: 3.8vw;
  margin-top: 2vw;
  margin-bottom: 1vw;
  color: #3a3e3f;
  margin-right: 1vw;
}

.total .blank{
  height: 15vw;
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
.total .footer p{
  margin-bottom: 3vw;
}
</style>