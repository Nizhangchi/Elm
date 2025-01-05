<!--<script setup lang="ts">-->
<!--import { ref } from 'vue';-->
<!--import router from "@/router";-->
<!--// 返回首页  -->
<!--const returnIcon = () => {-->
<!--  router.push('/index');-->
<!--};-->
<!--// 跳转到确认订单页面  -->
<!--const confirmOrder = () => {-->
<!--  router.push('/confirmOrder');-->
<!--};-->
<!--// 定义商品接口  -->
<!--interface Item {-->
<!--  name: string;-->
<!--  price: number;-->
<!--  quantity: number;-->
<!--  selected: boolean;-->
<!--}-->
<!--// 定义商品数据  -->
<!--const items = ref([-->
<!--  { name: '葡萄柚绿', price: 15, quantity: 0, selected: false },-->
<!--  { name: '四季奶青', price: 13, quantity: 0, selected: false },-->
<!--  { name: '奶绿装芒', price: 17, quantity: 0, selected: false },-->
<!--  { name: '抹茶奶茶', price: 16, quantity: 0, selected: false },-->
<!--  { name: '椰冻椰奶青', price: 15, quantity: 0, selected: false },-->
<!--  { name: '阿华田', price: 16, quantity: 0, selected: false },-->
<!--  { name: '波霸奶绿', price: 13, quantity: 0, selected: false },-->
<!--  { name: '波霸奶茶', price: 13, quantity: 0, selected: false },-->
<!--  { name: '乌龙奶茶', price: 13, quantity: 0, selected: false },-->
<!--]);-->
<!--// 增加商品数量  -->
<!--const increaseQuantity = (item: Item) => {-->
<!--  item.quantity += 1;-->
<!--  item.selected = true;-->
<!--};-->
<!--// 减少商品数量  -->
<!--const decreaseQuantity = (item: Item) => {-->
<!--  if (item.quantity > 0) {-->
<!--    item.quantity -= 1;-->
<!--    if (item.quantity === 0) {-->
<!--      item.selected = false;-->
<!--    }-->
<!--  }-->
<!--};-->
<!--// 计算总金额  -->
<!--const totalAmount = computed(() => {-->
<!--  return items.value.reduce((total, item) => total + item.price * item.quantity, 0);-->
<!--});-->
<!--// 计算购物包中的商品数量  -->
<!--const totalItems = computed(() => {-->
<!--  return items.value.filter(item => item.quantity > 0).length;-->
<!--});-->
<!--</script>-->
<script setup lang="ts">

import router from "@/router";

const returnIcon = () => {
  router.push('/index')
}
const confirmOrder = () => {
  router.push('/confirmOrder')
}

</script>

<template>
  <body>
  <div class="total">
    <div class="header">
      <div class="return" @click="returnIcon"><</div>
      <div class="search-button"><i class="fa-solid fa-magnifying-glass"></i></div>
      <div class="chat-button">🗨️</div>
      <div class="heart-button">❤</div>
      <div class="more-button"><i class="fa fa-ellipsis-h"></i></div>
    </div>
    <div class="background">
      <img src="../assets/img/business/1..02.png" >
    </div>
    <div class="body">
      <div class="title">
        <div class="title-top">
          <div class="left">
            <div class="name">1点点（昆明大学城店）</div>
            <div class="details">
              <div class="score">4.9分</div>
              <div class="delivery">蜂鸟准时达</div>
              <div class="time">约30分钟 · 月售2000+</div>
            </div>
            <div class="announcement">公告：我们降糖啦喜欢偏甜选比之前大一级的甜度...</div>
          </div>
          <div class="right">
            <img src="../assets/img/business/1..01.png">
          </div>
        </div>
        <div class="ticket">
          <div class="ticket1">👑￥6无门槛|兑</div>
          <div class="ticket2">￥2|兑</div>
        </div>
        <div class="discount">
          <div class="discount1">&nbsp;2元红包&nbsp;</div>
          <div class="discount2">&nbsp;配送费优惠&nbsp;</div>
          <div class="total-discount">2个优惠 ></div>
        </div>
      </div>
      <div class="recommend">
        <img src="../assets/img/business/1..03.png" >
        <div class="details">呈贡区奶茶果汁回头客榜·第5名></div>
        <div class="recommend-last">每日更新</div>
      </div>
      <div class="vip-card">
        <div class="top-content">
          1点点会员卡 >
        </div>
        <div class="content">
          <div class="left-content">
            <div class="line1">免费入会享好礼</div>
            <div class="line2">入会送<span style="color: #fb6242">12元</span>全场代金券</div>
          </div>
          <div class="right">
            免费领取
          </div>
        </div>
      </div>
      <div class="business">
        <div class="header-choice">
          <div class="item-selected">
            <div class="text">点餐</div>
            <div class="decoration">—</div>
          </div>
          <div class="item">评价</div>
          <div class="item">品牌</div>
          <div class="together"><i class="fa-solid fa-champagne-glasses "></i>一起喝</div>
        </div>
        <div class="card">
          <img style="width: 100%;" src="../assets/img/business/1..04.png" >
        </div>
        <div style="background-color: #7bc4e7; border-radius: 5px" class="card">
          <img style="width: 100%;" src="../assets/img/business/1..05.png" >
          <div class="recommendList">
            <div class="recommendItem">
              <div class="picture">
                <img style="width: 100%; height: 100%" src="../assets/img/business/1..06.png">
              </div>
              <div class="name">奥利奥雪顶奶青</div>
              <div class="discount-price">
                ￥16起
                <div class="estimate">预估到手</div>
              </div>
              <div class="original-price">￥19 起 <i class="fa-solid fa-circle-plus"></i></div>
            </div>
            <div class="recommendItem">
              <div class="picture">
                <img style="width: 100%" src="../assets/img/business/1..07.png">
              </div>
              <div class="name">奥利奥薄荷遇...</div>
              <div class="discount-price">
                ￥21
                <div class="estimate">预估到手</div>
              </div>
              <div class="original-price">￥24 <i class="fa-solid fa-circle-plus"></i></div>
            </div>
            <div class="recommendItem">
              <div class="picture">
                <img style="width: 100%" src="../assets/img/business/1..08.png">
              </div>
              <div class="name">冰淇淋红茶</div>
              <div class="discount-price">
                ￥13起
                <div class="estimate">预估到手</div>
              </div>
              <div class="original-price">¥16 起 <i class="fa-solid fa-circle-plus"></i></div>
            </div>
          </div>
        </div>
        <div class="foodList">
          <div class="menu">
            <div class="menuItem-selected">🔥热销</div>
            <div class="menuItem">经典必喝</div>
            <div class="menuItem">遇冰沙</div>
            <div class="menuItem">花果奶茶</div>
            <div class="menuItem">找好奶</div>
            <div class="menuItem">找果茶</div>
            <div class="menuItem">点口感</div>
            <div class="menuItem">点抹茶</div>
            <div class="menuItem">0茶区</div>
            <div class="menuItem">加小料</div>
            <div class="menuItem">用餐提醒</div>
          </div>
          <div class="goods">
            <div class="goods-title">热销 <span style="font-size: 3.5vw;color: #9F9F9F;font-weight: lighter">大家喜欢吃，才叫真好吃</span></div>
            <div class="goodsItem">
              <div class="goodsPicture"><img style="width: 100%" src="../assets/img/business/GrapefruitGreen.jpg"></div>
              <div class="goodsDetails">
                <div class="name" style="font-weight: bold;">葡萄柚绿</div>
                <div class="standings"><span style="color: #9d4c17; font-weight: bold;background-color: #f7d9ab" >榜</span>呈贡区水果茶回头客第4名</div>
                <div class="sales">月售100+ 好评率100%</div>
                <div class="food-price">
                  ￥<span style="font-size: 4.5vw">15</span>起
                  <div class="choose-button">选规格</div>
                </div>
              </div>
            </div>
            <div class="goodsItem">
              <div class="goodsPicture"><img style="width: 100%" src="../assets/img/business/1..09.png"></div>
              <div class="goodsDetails">
                <div class="name" style="font-weight: bold;">四季奶青</div>
                <div class="standings">“味道很好”</div>
                <div class="sales">月售300+ 好评率99%</div>
                <div class="food-price">
                  ￥<span style="font-size: 4.5vw">13</span>起
                  <div class="choose-button">选规格</div>
                </div>
              </div>
            </div>
            <div class="goodsItem">
              <div class="goodsPicture"><img style="width: 100%" src="../assets/img/business/1..10.png"></div>
              <div class="goodsDetails">
                <div class="name" style="font-weight: bold;">奶绿装芒</div>
                <div class="standings"><span style="color: #9d4c17; font-weight: bold;background-color: #f7d9ab" >榜</span>呈贡区现制奶茶综合第2名</div>
                <div class="sales">月售200+ 好评率100%</div>
                <div class="food-price">
                  ￥<span style="font-size: 4.5vw">17</span>起
                  <div class="choose-button">选规格</div>
                </div>
              </div>
            </div>
            <div class="goodsItem">
              <div class="goodsPicture"><img style="width: 100%" src="../assets/img/business/1..11.png"></div>
              <div class="goodsDetails">
                <div class="name" style="font-weight: bold;">抹茶奶茶</div>
                <div class="standings">7天内30人下单</div>
                <div class="sales">月售100+ 好评率100%</div>
                <div class="food-price">
                  ￥<span style="font-size: 4.5vw">16</span>起
                  <div class="choose-button">选规格</div>
                </div>
              </div>
            </div>
            <div class="goodsItem">
              <div class="goodsPicture"><img style="width: 100%" src="../assets/img/business/1..12.png"></div>
              <div class="goodsDetails">
                <div class="name" style="font-weight: bold;">椰冻椰奶青</div>
                <div class="standings">椰香四溢 四季春茶</div>
                <div class="sales">月售72 好评率100%</div>
                <div class="food-price">
                  ￥<span style="font-size: 4.5vw">15</span>起
                  <div class="choose-button">选规格</div>
                </div>
              </div>
            </div>
            <div class="goodsItem">
              <div class="goodsPicture"><img style="width: 100%" src="../assets/img/business/1..13.png"></div>
              <div class="goodsDetails">
                <div class="name" style="font-weight: bold;">阿华田</div>
                <div class="standings">7天内20人下单</div>
                <div class="sales">月售73 好评率94%</div>
                <div class="food-price">
                  ￥<span style="font-size: 4.5vw">16</span>起
                  <div class="choose-button">选规格</div>
                </div>
              </div>
            </div>
            <div class="goodsItem">
              <div class="goodsPicture"><img style="width: 100%" src="../assets/img/business/1..14.png"></div>
              <div class="goodsDetails">
                <div class="name" style="font-weight: bold;">波霸奶绿</div>
                <div class="standings">7天内18人下单</div>
                <div class="sales">月售50</div>
                <div class="food-price">
                  ￥<span style="font-size: 4.5vw">13</span>起
                  <div class="choose-button">选规格</div>
                </div>
              </div>
            </div>
            <div class="goodsItem">
              <div class="goodsPicture"><img style="width: 100%" src="../assets/img/business/1..15.png"></div>
              <div class="goodsDetails">
                <div class="name" style="font-weight: bold;">波霸奶茶</div>
                <div class="standings">近期4人给出好评</div>
                <div class="sales">月售98 好评率100%</div>
                <div class="food-price">
                  ￥<span style="font-size: 4.5vw">13</span>起
                  <div class="choose-button">选规格</div>
                </div>
              </div>
            </div>
            <div class="goodsItem">
              <div class="goodsPicture"><img style="width: 100%" src="../assets/img/business/1..16.png"></div>
              <div class="goodsDetails">
                <div class="name" style="font-weight: bold;">乌龙奶茶</div>
                <div class="standings">乌龙清香</div>
                <div class="sales">月售怎么只有51?!</div>
                <div class="food-price">
                  ￥<span style="font-size: 4.5vw">13</span>起
                  <div class="choose-button">选规格</div>
                </div>
              </div>
            </div>
          </div>

        </div>
      </div>
    </div>

    <div style="height: 15vw" class="blank"> </div>
    <div class="footer">
      <div class="left-img">
        <img class="number-top" src="../assets/img/business/1..17.png">
      </div>

      <div class="money">
        <div class="price">￥<span style="font-size: larger">19</span><span style="color: #d6615b; font-size: smaller;margin-left: 1vw   ">券后约￥15</span>👆</div>
        <div class="delivery-price">另需配送费约￥1 <span style="font-size: smaller; text-decoration: line-through">￥5</span></div>
      </div>
      <div class="buy-button" @click="confirmOrder">去结算</div>
    </div>


  </div>

  </body>
</template>

<style scoped>
.total{
  width: 100%;
  height: 100%;
}

/*header样式*/
.total .header{
  width: 100%;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-around;
  height: 15vw;
  font-size: 6vw;
  background-color: white;
  position: fixed;
}
.total .header .return{
  flex:4;
  margin-left: 5vw;
}
.total .header .search-button,
.total .header .chat-button,
.total .header .heart-button,
.total .header .more-button{
  flex:1;
}

.total .background{
  height: 75vw;
}
.total .background img{
  width: 100%;
}
/*body样式*/
.total .body{
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background-color: whitesmoke;
}
.total .body .title{
  display: flex;
  flex-direction: column;
  width: 90%;
  border-radius: 10px;
  height: 40vw;
  background-color: white;
}
.total .body .title .title-top{
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  height: 60%;
  width: 97%;
  margin-left: 2vw;
}
.total .body .title .title-top .left{
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  flex: 8;
  height: 100%;
}
.total .body .title .title-top .left .name{
  font-size: 6vw;
  font-weight: bolder;
}
.total .body .title .title-top .left .details{
  display: flex;
  flex-direction: row;
}
.total .body .title .title-top .left .details .score{
  color: #f98031;
}
.total .body .title .title-top .left .details .delivery{
  display: flex;
  flex-direction: row;
  align-items:center;
  justify-content: center;
  font-size: 2.8vw;
  color: #17BAF9;
  border: lightskyblue 1px solid;
  border-radius: 3px;
  margin-left: 2vw;
  width: 21%;
}
.total .body .title .title-top .left .details .time{
  font-size: 3.5vw;
  margin-left: 2vw;
}
.total .body .title .title-top .left .announcement{
  display: flex;
  flex-direction: row;

  font-size: 3vw;
  color: #999999;

}
.total .body .title .title-top .right{
  flex:2;
}
.total .body .title .title-top .right img{
  width: 100%;
}
.total .body .title .ticket{
  display: flex;
  flex-direction: row;
  height: 20%;
  align-items: center;
}
.total .body .title .ticket .ticket1{
  display: flex;
  flex-direction: row;
  justify-content: center;
  border-radius: 3px;
  background-color: #f1d498;
  color: #8f6429;
  margin-left: 2vw;
  width: 35%;
}
.total .body .title .ticket .ticket1 i{
  color: #cc9151;
}
.total .body .title .ticket .ticket2{
  width: 15%;
  display: flex;
  flex-direction: row;
  justify-content: center;
  background-color:#fb6242;
  color: white;
  border-radius: 3px;
  margin-left: 2vw;
}
.total .body .title .discount{
  display: flex;
  flex-direction: row;
  height: 20%;
  align-items: center;
}
.total .body .title .discount .discount1,
.total .body .title .discount .discount2{
  border-radius: 5px;
  border: #d6615b 1px solid;
  font-size: 3.5vw;
  color: #d6615b;
  margin-left: 2vw;
}
.total .body .title .discount .total-discount{
  margin-left: auto;
  color: #999999;
  font-size: 3.5vw;
  margin-right: 2vw;
}
/*推荐样式*/
.total .body .recommend{
  display: flex;
  flex-direction: row;
  align-items: center;
  width: 90%;
  margin-top: 5vw;
  height: 10vw;
  background-color: white;
  border-radius: 5px;
  color: #7b5934;
}
.total .body .recommend img{
  width: 25%;
}
.total .body .recommend .details{
  font-size: 3.4vw;
  margin-left: 2vw;
}
.total .body .recommend .recommend-last{
  margin-left: auto;
  font-size: 3.4vw;
  margin-right: 1vw;
}
.total .body .vip-card{
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 90%;
  border-radius: 5px;
  background-color: #555152;
  height: 24vw;
  margin-top: 5vw;
}
.total .body .vip-card .top-content{
  font-size: 4.2vw;
  display: flex;
  flex-direction: row;
  align-items: center;
  color: #d0bfab;
  width: 95%;
}
.total .body .vip-card .top-content i{
  margin-left: auto;
}
.total .body .vip-card .content{
  width: 95%;
  display: flex;
  flex-direction: row;
  align-items: center;
  background-color: white;
  border-radius: 5px;
  height: 13vw;
  margin-top: 1vw;
}
.total .body .vip-card .content .left-content{
  display: flex;
  flex-direction: column;
  margin-left: 2vw;
}
.total .body .vip-card .content .left-content .line1{
  font-size: 4.2vw;
}
.total .body .vip-card .content .left-content .line2{
  font-size: 3.2vw;
  color: #999999;
  margin-top: 1vw;
}
.total .body .vip-card .content .right{
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  width: 22%;
  background-color: #fb664f;
  color: white;
  border-radius: 8px;
  margin-left: auto;
  height: 5vw;
  font-size: 3.6vw;
  margin-right: 2vw;
}
.total .body .business{
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: white;
  width: 100%;
}
.total .body .business .header-choice{
  display: flex;
  flex-direction: row;
  width: 100%;
  height: 8vw;
  margin-top: 5vw;
  justify-content: space-around;
  position: sticky;
  top: 15vw;
  background-color: white;
  padding: 5px 0;
}
.total .body .business .header-choice .item-selected{
  font-weight: bolder;
  display: flex;
  flex-direction: column;
  align-items: center;
}
.total .body .business .header-choice .item-selected .decoration{
  margin-top: -2vw;
}
.total .body .business .header-choice .together{
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  border-radius: 15px;
  color: #428870;
  border: 1px solid #428870;
  height: 6vw;
  width: 20%;
}
.total .body .business .card{
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 93%;
  margin-bottom: 3vw;
}
.total .body .business .card .recommendList{
  display: flex;
  flex-direction: row;
  align-items: center;
  width: 100%;
  justify-content: space-between;
  margin-bottom: 2vw;
}
.total .body .business .card .recommendList .recommendItem{
  display: flex;
  flex-direction: column;
  background-color: white;
  border-radius: 5px;
  margin:2px;

}
.total .body .business .card .recommendList .recommendItem .picture{
  width: 100%;
}
.total .body .business .card .recommendList .recommendItem .name{
  margin-left: 1vw;
  margin-bottom: 1vw;
}
.total .body .business .card .recommendList .recommendItem .discount-price{
  display: flex;
  flex-direction: row;
  align-items: center;
  color: #fb6242;
  margin-bottom: 1vw;
  margin-left: 1vw;
}
.total .body .business .card .recommendList .recommendItem .discount-price .estimate{
  color: white;
  background-color: #fb6242;
  font-size: 3.3vw;
  margin-left: 1vw;
  border-radius: 3px;
}
.total .body .business .card .recommendList .recommendItem .original-price{
  display: flex;
  flex-direction: row;
  margin-bottom: 1vw;
  margin-left: 1vw;
}
.total .body .business .card .recommendList .recommendItem .original-price i{
  margin-left: auto;
  color: #428870;
  margin-right: 2vw;
  font-size: 5vw
}
/*foodList*/
.total .body .business .foodList{
  width: 100%;
  display: flex;
  flex-direction: row;
}
.total .body .business .foodList .menu{
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 20%;
  background-color: whitesmoke;
  height:100%;
  position: sticky;
  top: 23vw;
}
.total .body .business .foodList .menu .menuItem-selected{
  display: flex;
  align-items: center;
  height: 12vw;
  background-color: white;
  margin-left: 2vw;
}
.total .body .business .foodList .menu .menuItem-selected i{
  margin-right: 1vw;
}
.total .body .business .foodList .menu .menuItem{
  display: flex;
  align-items: center;
  font-size: 4vw;
  color: #666666;
  height: 15vw;
  margin-left: 2vw;
}
.total .body .business .foodList .goods{
  display: flex;
  flex-direction: column;
  margin-left: 5vw;
  width: 80%;
}
.total .body .business .foodList .goods .goods-title{
  font-weight: bolder;
  font-size: 4.2vw;
  height: 8vw;
  margin-top: 2vw;
}
.total .body .business .foodList .goods .goodsItem{
  display: flex;
  flex-direction: row;
  align-items: center;
  height: 25vw;
  margin-top: 10vw;
}
.total .body .business .foodList .goods .goodsItem .goodsPicture{
  width: 35%;
}
.total .body .business .foodList .goods .goodsItem .goodsDetails{
  width: 65%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  margin-left: 2vw;
}
.total .body .business .foodList .goods .goodsItem .goodsDetails .food-price{
  display: flex;
  flex-direction: row;
  align-items: center;
}
.total .body .business .foodList .goods .goodsItem .goodsDetails .standings{
  font-size: 3.5vw;
  color: #9d8571;
  background-color: #fcefdb;
  border-radius: 5px;
  width: fit-content;
  margin-top: 2vw;
}
.total .body .business .foodList .goods .goodsItem .goodsDetails .sales{
  color: #9F9F9F;
  font-size: 3.2vw;
  margin-top: 2vw;
}
.total .body .business .foodList .goods .goodsItem .goodsDetails .food-price{
  margin-top: 3vw;
  font-size: 3.8vw;
}
.total .body .business .foodList .goods .goodsItem .goodsDetails .food-price .choose-button{
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  margin-left: auto;
  margin-right: 4vw;
  border-radius: 10px;
  color: white;
  background-color: #428870;
  width: 30%;
  height: 6vw;
  font-size: 3.5vw;
}


/*footer样式*/
.total .footer{
  width: 100%;
  height: 13vw;
  display: flex;
  flex-direction: row;
  align-items: center;

  position: fixed;
  left: 0;
  bottom: 0;
  background-color: white;
}
.total .footer .left-img{
  display: flex;
  flex-direction: column;
  width: 20%;
}
.total .footer .left-img img{
  width: 60%;
  margin-left: auto;

}
.total .footer .money{
  display: flex;
  flex-direction: column;
  justify-content: center;
  margin-left: 3vw;
}
.total .footer .money .delivery-price{
  color: #999999;
  font-size: 3vw;
}
.total .footer .buy-button{
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  font-size: 4.5vw;
  margin-left: auto;
  margin-right: 3vw;
  width: 35%;
  border-radius: 20px;
  background-color: #428870;
  color: white;
  height: 10vw;
}

</style>
<!--<script setup lang="ts">-->
<!--import { useRouter } from 'vue-router';-->
<!--import { ref } from 'vue';-->
<!--import axios from 'axios';-->

<!--const router = useRouter();-->
<!--const returnIcon = () => {-->
<!--  router.push('/alittletea')-->
<!--}-->

<!--// 假设订单ID是从路由或其他地方获取的-->
<!--const orderId = ref(route.params.orderId); // 假设路由参数是 orderId-->

<!--// 处理支付请求-->
<!--const handlePayment = async () => {-->
<!--  try {-->
<!--    const response = await axios.patch(`http://localhost:8080/customer/pay?id=${orderId.value}`);-->
<!--    if (response.data.code === 200) {-->
<!--      alert('支付成功');-->
<!--      // 支付成功后跳转到其他页面，例如订单详情页-->
<!--      router.push('/orderDetail');-->
<!--    } else {-->
<!--      alert('支付失败');-->
<!--    }-->
<!--  } catch (error) {-->
<!--    console.error('支付请求失败', error);-->
<!--    alert('支付请求失败');-->
<!--  }-->
<!--}-->