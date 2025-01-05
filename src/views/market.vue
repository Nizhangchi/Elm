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
const searchClick = () => {
  alert("搜索成功！");
};
</script>

<template>
  <body>
  <div class="total">
    <div class="header">
      <div class="location">
        云南大学呈贡校区📍
      </div>
      <img src="../assets/img/PK.png" class="PK">
    </div>

    <div class="title">
      <div class="title-top">全能超市</div>
      <div class="title-bottom">24小时营业</div>
    </div>
    <div class="search">
      <div class="search-panel">
        <i style="flex:0 0 6vw; padding-left: 3vw; font-size: 5vw;color: #17BAF9;" class="fa-solid fa-magnifying-glass "></i>
        <input style="flex:6;background-color:white" type="text"  placeholder="鸡胸肉"/>
        <div style="flex:0 0 16vw" class="search-button" @click="searchClick">搜索</div>
      </div>
    </div>
    <div class="Type">
      <div class="items">
        <img class="picture" src="../assets/img/marketImg/market1.png" >
        <div class="content-item">微熏小酒馆</div>
      </div>
      <div class="items">
        <img class="picture" src="../assets/img/marketImg/market2.png" >
        <div class="content-item">签到返钱</div>
      </div>
      <div class="items">
        <img class="picture" src="../assets/img/marketImg/market3.png" >
        <div class="content-item">冰激凌零食</div>
      </div>
      <div class="items">
        <img class="picture" src="../assets/img/marketImg/market4.png" >
        <div class="content-item">酒水饮料</div>
      </div>
      <div class="items">
        <img class="picture" src="../assets/img/marketImg/market5.png" >
        <div class="content-item">肉蛋蔬菜</div>
      </div>
      <div class="items">
        <img class="picture" src="../assets/img/marketImg/market6.png" >
        <div class="content-item">水果鲜花</div>
      </div>
      <div class="items">
        <img class="picture" src="../assets/img/marketImg/market7.png" >
        <div class="content-item">日用百货</div>
      </div>
      <div class="items">
        <img class="picture" src="../assets/img/marketImg/market8.png" >
        <div class="content-item">医药保健</div>
      </div>
      <div class="items">
        <img class="picture" src="../assets/img/marketImg/market9.png" >
        <div class="content-item">乳品烘焙</div>
      </div>
      <div class="items">
        <img class="picture" src="../assets/img/marketImg/market10.png" >
        <div class="content-item">速食面点</div>
      </div>
    </div>

    <div class="recommend">
      <div class="recommendItem selected">
        <div class="text">推荐</div>
        <div class="decoration">—</div>
      </div>
      <div class="recommendItem">休闲零食</div>
      <div class="recommendItem">酒水/饮料</div>
      <div class="recommendItem">日常用药</div>
      <div class="recommendItem">水果鲜花</div>
    </div>

    <div class="body">
      <div class="content">
        <div class="ad1">
          <img class="ad-img-top" src="./../assets/img/marketImg/tag1.png">
          <img class="ad-img" src="./../assets/img/marketImg/2.png">
          <div class="ad-text-top">鲜食满29减8元</div>
          <div class="ad-text-content">餐餐精选 餐餐优惠</div>
          <div class="ad-button">
            GO <i style="font-size: 3vw" class="fa-solid fa-chevron-right "></i>
          </div>
        </div>
        <div class="card">
          <img style="width: 58%" src="./../assets/img/marketImg/5.png" class="card-picture">
          <div class="card-content-title">大福乐 开胃丝 散装 约10g/袋</div>
          <div class="card-content-date">约1-3日达</div>
          <div class="card-content-bottom">
            <div class="price">￥<span style="font-size: 4.5vw;">0</span>.6 折后价</div>
            <div class="original-price">￥1</div>
            <i style="color: #17BAF9" class="fa-solid fa-circle-plus"></i>
          </div>
        </div>
        <div class="card">
          <img src="./../assets/img/marketImg/3.png" class="card-picture">
          <div class="card-content-title">邱灯明 火爆素鸡筋辣条20g/袋</div>
          <div class="card-content-date">预计1-3日达</div>
          <div class="card-content-bottom">
            <div class="price">￥<span style="font-size: 4.5vw;">0</span>.78 折后价</div>
            <div class="original-price">￥1</div>
            <i style="color: #17BAF9" class="fa-solid fa-circle-plus"></i>
          </div>
        </div>
      </div>
      <div class="content">
        <div class="card">
          <img src="./../assets/img/marketImg/1.png" class="card-picture">
          <div class="card-content-title">茄皇 茄皇鸡蛋面 120g/桶</div>
          <div class="card-content-date">预计1-3日达</div>
          <div class="card-content-bottom">
            <div class="price">￥<span style="font-size: 4.5vw;">5</span>.38 折后价</div>
            <div class="original-price">￥6.9</div>
            <i style="color: #17BAF9" class="fa-solid fa-circle-plus"></i>
          </div>
        </div>
        <div class="ad2">
          <img class="ad-img-top" src="./../assets/img/marketImg/tag2.png">
          <img class="ad-img" src="./../assets/img/marketImg/4.png">
          <div class="ad-text-top">天天领40元大额券</div>
          <div class="ad-text-content">超值爆款 折上返金</div>
          <div class="ad-button">
            GO <i style="font-size: 3vw" class="fa-solid fa-chevron-right "></i>
          </div>
        </div>
        <div class="card">
          <img src="./../assets/img/marketImg/7.png" class="card-picture">
          <div class="card-content-title">乐事薯片经典小零食口味随机12克/包</div>
          <div class="card-content-date">预计1-3日达</div>
          <div class="card-content-bottom">
            <div class="price">￥<span style="font-size: 4.5vw;">1</span>.4 折后价</div>
            <div class="original-price">￥1.8</div>
            <i style="color: #17BAF9" class="fa-solid fa-circle-plus"></i>
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
      <div @click="marketIcon"  class="selected">
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
  align-items: center;
  height: 15vw;
}
.total .header .location{
  margin-left: 3vw;
  font-size: 5vw;
}
.total .header .PK{
  width: 15%;
  margin-left: auto;
  margin-right: 4vw;
  border-radius: 20px;
  cursor: pointer;
}
.total .title{
  display: flex;
  height: 25vw;
  flex-direction: column;
  justify-content: center;
}
.total .title .title-top{
  font-size: 9vw;
  font-weight: bolder;
  margin-left: 3vw;
  font-family: 幼圆;
}
.total .title .title-bottom{
  font-size: 4.5vw;
  margin-top: 2vw;
  margin-left: 3vw;
}

/*搜索样式*/
.total .search {
  width: 100%;
  height: 10vw;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  background-color: white;
}

.total .search .search-panel {
  width: 95%;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  border: 2px solid #17BAF9;
  height: 10vw;
  border-radius: 25px;
  color: #9F9F9F;
}

.total .search .search-panel input {
  outline: none;
  border: none;
  color: #9F9F9F;
  font-size: 4vw;
}

.total .search .search-panel .search-button {
  cursor: pointer;
  height: 9vw;
  border-radius: 25px;
  background-color: #17BAF9;
  color: white;
  font-size: 4vw;
  display: flex;
  align-items: center;
  justify-content: center;
  margin-right: 0.5vw;
}

/*分类样式*/
.total .Type{
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  align-items: center;
  height: 45vw;
}
.total .Type .items{
  display: flex;
  flex-direction: column;
  align-items: center;
  flex-basis: 20%;
}
.total .Type .items .picture{
  width: 60%;
  margin-top: 2vw;
}
.total .Type .items .content-item{
  margin-top: 1vw;
  font-size: 3.5vw;
}

/*recommend 样式*/
.total .recommend{
  margin-top: 3vw;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
  align-items: center;
  background-color: #f5fcfc;
}
.total .recommend .recommendItem{
  align-items: center;
  justify-content: center;
  width:20%;
  height: 5vw;
  font-size: 4vw;
  cursor: pointer;
  background-color: white;
  border-radius: 5px;
  text-align: center;
}
.total .recommend .selected{
  font-weight: bolder;
  font-size: 5vw;
}
.total .recommend .selected .decoration{
  color: #17BAF9;
  margin-top: -2vw;
  font-weight: bolder;
}

/*body样式*/
.total .body{
  margin-top: 5vw;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-around;
  background-color: whitesmoke;
}
.total .body .content{
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 45%;
}
.total .body .content .ad1{
  display: flex;
  flex-direction: column;
  justify-content: center;
  background-color: #f98031;
  color: white;
  border-radius: 10px;
  margin-bottom: 3vw;
  margin-top: 4vw;
}
.total .body .content .ad1 .ad-img-top{
  width: 40%;
  z-index: 99;
  margin-bottom: -5vw;
}

.total .body .content .ad1 .ad-img{
  width: 100%;
}
.total .body .content .ad1 .ad-text-top{
  font-size: 5vw;
  margin-left: 3vw;
  margin-top: 2vw;
}
.total .body .content .ad1 .ad-text-content{
  font-size: 3.8vw;
  margin-left: 3vw;
  margin-top: 1.5vw;
}
.total .body .content .ad1 .ad-button{
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  margin-left: 3vw;
  margin-top: 1.5vw;
  width: 25%;
  color: #f98031;
  font-weight: bolder;
  background-color: white;
  margin-bottom: 2vw;
  border-radius: 10px;
  cursor: pointer;
}
.total .body .content .ad2{
  display: flex;
  flex-direction: column;
  justify-content: center;
  background-color: #51b4ec;
  color: white;
  border-radius: 10px;
  margin-bottom: 3vw;
}
.total .body .content .ad2 .ad-img-top{
  width: 40%;
  z-index: 99;
}

.total .body .content .ad2 .ad-img{
  width: 100%;
  margin-top: -5vw;
}
.total .body .content .ad2 .ad-text-top{
  font-size: 5vw;
  margin-left: 3vw;
  margin-top: 2vw;
}
.total .body .content .ad2 .ad-text-content{
  font-size: 3.8vw;
  margin-left: 3vw;
  margin-top: 1.5vw;
}
.total .body .content .ad2 .ad-button{
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  margin-left: 3vw;
  margin-top: 1.5vw;
  width: 25%;
  color: #51b4ec;
  font-weight: bolder;
  background-color: white;
  margin-bottom: 2vw;
  border-radius: 10px;
  cursor: pointer;
}
.total .body .content .card{
  display: flex;
  flex-direction: column;
  justify-content: center;
  border-radius: 10px;
  margin-bottom: 3vw;
  background-color: white;
  margin-top: 2vw;
}
.total .body .content .card .card-picture{
  width: 100%;
  align-self: center;
  margin-bottom: 5vw;
  margin-top: 4vw;
}
.total .body .content .card .card-content-title {
  margin-left: 2vw;
  font-size: 4vw;
  margin-top: 1.5vw;
}
.total .body .content .card .card-content-date {
  font-size: 3.2vw;
  color: #17BAF9;
  border: #CEFEFF 1px solid;
  border-radius: 5px;
  text-align: left;
  margin-right: auto;
  margin-left: 3vw;
  margin-top: 1.5vw;
}
.total .body .content .card .card-content-bottom {
  display: flex;
  flex-direction: row;
  margin-top: 1.5vw;
  align-items: center;
  justify-content: center;
  margin-bottom: 1.5vw;
}
.total .body .content .card .card-content-bottom .price{
  color: red;
  font-size: 3.8vw;
  margin-left: 2vw;
}
.total .body .content .card .card-content-bottom .original-price{
  color: #999999;
  text-decoration: line-through;
}
.total .body .content .card .card-content-bottom i{
  margin-left: auto;
  margin-right: 2vw;
  font-size: 6vw;
}



.total .blank{
  height: 30vw;
  background-color: whitesmoke;
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