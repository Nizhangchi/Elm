<script setup lang="ts">
import { useRouter } from 'vue-router';
const router = useRouter();
const returnIcon = () => {
  router.push('/index')
}
const goToBusiness = () => {
  router.push('/alittletea')
}
</script>

<template>
  <body>
  <div class="wrapper">
    <div class="header">
      <i @click="returnIcon" style="margin-right: 2vw;margin-left: 3vw;"><</i>
      美食外卖
      <i style="margin-left: auto;margin-right: 3vw" class="fa fa-ellipsis-h"></i>
    </div>
    <div class="recommend">
      <div class="recommendItem selected">换换口味</div>
      <div class="recommendItem">天天爆红包</div>
      <div class="recommendItem">减配送费</div>
      <div class="recommendItem">学生特价</div>
      <i >···</i>
    </div>
    <div class="foodList">
      <div class="foodItem">
        <div class="foodLeft">
          <img class="img_logo" src="../assets/img/kaoya.png"/>
        </div>
        <div class="foodRight">
          <div class="right-header">
            <div class="header-tag">爆红包</div>
            <div class="header-text">京小丫·北京烤鸭 (..</div>
            <i class="fas fa-times"></i>
          </div>
          <div class="details">
            <div class="details-mark">4.9分</div>
            <div class="details-count">月售800+</div>
            <div class="details-time">30分钟 3km</div>
          </div>
          <div class="delivery">
            <div class="start-price">起送￥18</div>
            <div class="delivery-price">免配送费</div>
            <div class="original-price">￥3.3</div>
            <div class="delivery-tag">蜂鸟准时达</div>
          </div>
          <div class="evaluation">
            <div class="evaluation-content2">近30日83个回头客</div>
          </div>
          <div class="coupons">
            <div class="coupon2">13减1|33减3</div>
            <div class="coupon1">
              👑7元无门槛
            </div>
            <div class="coupons-menu">></div>
          </div>
        </div>
      </div>
      <div class="foodItem" @click="goToBusiness">
        <div class="foodLeft">
          <img class="img_logo" src="../assets/img/business/1..01.png"/>
        </div>
        <div class="foodRight">
          <div class="right-header">
            <div class="header-tag">爆红包</div>
            <div class="header-text">1点点(昆明大学...</div>
            <i class="fas fa-times"></i>
          </div>
          <div class="details">
            <div class="details-mark">4.9分</div>
            <div class="details-count">月售2000+</div>
            <div class="details-time">30分钟 4.8km</div>
          </div>
          <div class="delivery">
            <div class="start-price">起送￥15</div>
            <div class="delivery-price">配送￥1</div>
            <div class="original-price">￥5</div>
            <div class="delivery-tag">蜂鸟准时达</div>
          </div>
          <div class="evaluation">
            <div class="evaluation-content2">近期买过 葡萄柚绿</div>
          </div>
          <div class="coupons">
            <div class="coupon1">
              👑7元无门槛
            </div>
            <div class="coupon2">2元店铺红包</div>
            <div class="coupons-menu">></div>
          </div>
        </div>
      </div>
      <div class="foodItem">
        <div class="foodLeft">
          <img class="img_top" src="../assets/img/super_member.png"/>
          <img class="img_logo" src="../assets/img/sj04.png"/>
        </div>
        <div class="foodRight">
          <div class="right-header">
            <div class="header-tag">爆红包</div>
            <div class="header-text">米村拌饭(浑南店)</div>
            <i class="fas fa-times"></i>
          </div>
          <div class="details">
            <div class="details-mark">4.6分</div>
            <div class="details-count">月售100+</div>
            <div class="details-time">45分钟 4.1km</div>
          </div>
          <div class="delivery">
            <div class="start-price">起送￥18</div>
            <div class="delivery-price">￥3</div>
            <div class="original-price">￥5</div>
            <div class="delivery-tag">蜂鸟准时达</div>
          </div>
          <div class="evaluation">
            <div class="evaluation-title">食极星</div>
            <div class="evaluation-content">拌饭套餐</div>
          </div>
          <div class="coupons">
            <div class="coupon1">
              👑6元无门槛
            </div>
            <div class="coupons-menu">></div>
          </div>
        </div>
      </div>
      <div class="foodItem">
        <div class="foodLeft">
          <img class="img_logo" src="../assets/img/yuanjiyunjiao.png"/>
        </div>
        <div class="foodRight">
          <div class="right-header">
            <div class="header-tag">爆红包</div>
            <div class="header-text">袁记云饺(仕林街店)</div>
            <i class="fas fa-times"></i>
          </div>
          <div class="details">
            <div class="details-mark">4.8分</div>
            <div class="details-count">月售1000+</div>
            <div class="details-time">36分钟 3km</div>
          </div>
          <div class="delivery">
            <div class="start-price">起送￥20</div>
            <div class="delivery-price">配送￥0.2</div>
            <div class="delivery-tag">蜂鸟准时达</div>
          </div>
          <div class="evaluation">
            <div class="evaluation-title">食极星</div>
            <div class="evaluation-content">玉米鲜肉饺:均衡搭配|手工现包</div>
          </div>
          <div class="coupons">
            <div class="coupon1">
              👑8元无门槛
            </div>
            <div class="coupon2">返2元红包</div>
            <div class="coupons-menu">></div>
          </div>
        </div>
      </div>
      <div class="foodItem">
        <div class="foodLeft">
          <img class="img_logo" src="../assets/img/sj01.png"/>
        </div>
        <div class="foodRight">
          <div class="right-header">
            <div class="header-tag">爆红包</div>
            <div class="header-text">万家饺子(软件...</div>
            <i class="fas fa-times"></i>
          </div>
          <div class="details">
            <div class="details-mark">4.7分</div>
            <div class="details-count">月售600+</div>
            <div class="details-time">39分钟 3.2km</div>
          </div>
          <div class="delivery">
            <div class="start-price">起送￥18</div>
            <div class="delivery-price">免配送费</div>
            <div class="original-price">￥3.5</div>
            <div class="delivery-tag">蜂鸟准时达</div>
          </div>
          <div class="evaluation">
            <div class="evaluation-content2">🥟各种饺子等你品尝</div>
          </div>
          <div class="coupons">
            <div class="coupon2">14减1</div>
            <div class="coupon1">
              👑6元无门槛
            </div>
            <div class="coupons-menu">></div>
          </div>
        </div>
      </div>
      <div class="foodItem">
        <div class="foodLeft">
          <img class="img_logo" src="../assets/img/sj02.png"/>
        </div>
        <div class="foodRight">
          <div class="right-header">
            <div class="header-tag">爆红包</div>
            <div class="header-text">小锅饭豆腐馆(全...</div>
            <i class="fas fa-times"></i>
          </div>
          <div class="details">
            <div class="details-mark">4.9分</div>
            <div class="details-count">月售500+</div>
            <div class="details-time">46分钟 3.7km</div>
          </div>
          <div class="delivery">
            <div class="start-price">起送￥15</div>
            <div class="delivery-price">￥1</div>
            <div class="original-price">￥3</div>
            <div class="delivery-tag">蜂鸟准时达</div>
          </div>
          <div class="evaluation">
            <div class="evaluation-title-fire">🍜</div>
            <div class="evaluation-content2">美味小锅套餐</div>
          </div>
          <div class="coupons">
            <div class="coupon2">15减2|25减5</div>
            <div class="coupon1">
              <i class="fa-solid fa-crown "></i>7元无门槛
            </div>
            <div class="coupons-menu">></div>
          </div>
        </div>
      </div>
      <div class="foodItem">
        <div class="foodLeft">
          <img class="img_logo" src="../assets/img/sj03.png"/>
        </div>
        <div class="foodRight">
          <div class="right-header">
            <div class="header-tag">爆红包</div>
            <div class="header-text">麦当劳麦乐送</div>
            <i class="fas fa-times"></i>
          </div>
          <div class="details">
            <div class="details-mark">4.5分</div>
            <div class="details-count">月售1000+</div>
            <div class="details-time">30分钟 2.9km</div>
          </div>
          <div class="delivery">
            <div class="start-price">起送￥25</div>
            <div class="delivery-price">￥4</div>
            <div class="original-price">￥10</div>
            <div class="delivery-tag">蜂鸟准时达</div>
          </div>
          <div class="evaluation">
            <div class="evaluation-title-fire">🍔</div>
            <div class="evaluation-content2">近期购买过</div>
          </div>
          <div class="coupons">
            <div class="coupon2">配送费满39减6</div>
            <div class="coupon1">
              <i class="fa-solid fa-crown "></i>5元无门槛
            </div>
            <div class="coupons-menu">></div>
          </div>
        </div>
      </div>
      <div class="foodItem">
        <div class="foodLeft">
          <img class="img_logo" src="../assets/img/sj05.png"/>
        </div>
        <div class="foodRight">
          <div class="right-header">
            <div class="header-tag">爆红包</div>
            <div class="header-text">申记串道（中海...</div>
            <i class="fas fa-times"></i>
          </div>
          <div class="details">
            <div class="details-mark">4.6分</div>
            <div class="details-count">月售300+</div>
            <div class="details-time">50分钟 4.8km</div>
          </div>
          <div class="delivery">
            <div class="start-price">起送￥20</div>
            <div class="delivery-price">￥4</div>
            <div class="original-price">￥6</div>
            <div class="delivery-tag">蜂鸟准时达</div>
          </div>
          <div class="evaluation">
            <div class="evaluation-title-fire">🍡</div>
            <div class="evaluation-content2">呈贡区烤串炸串第一名</div>
          </div>
          <div class="coupons">
            <div class="coupon2">25减3</div>
            <div class="coupon1">
              👑7元无门槛
            </div>
            <div class="coupons-menu">></div>
          </div>
        </div>
      </div>
      <div class="foodItem">
        <div class="foodLeft">
          <img class="img_logo" src="../assets/img/sj06.png"/>
        </div>
        <div class="foodRight">
          <div class="right-header">
            <div class="header-tag">爆红包</div>
            <div class="header-text">半亩良田排骨米饭</div>
            <i class="fas fa-times"></i>
          </div>
          <div class="details">
            <div class="details-mark">4.8分</div>
            <div class="details-count">月售500+</div>
            <div class="details-time">45分钟 4.3km</div>
          </div>
          <div class="delivery">
            <div class="start-price">起送￥22</div>
            <div class="delivery-price">￥4</div>
            <div class="original-price">￥8</div>
            <div class="delivery-tag">蜂鸟准时达</div>
          </div>
          <div class="evaluation">
            <div class="evaluation-title">食极星</div>
            <div class="evaluation-content">排骨米饭好评榜</div>
          </div>
          <div class="coupons">
            <div class="coupon1">
              👑8元无门槛
            </div>
            <div class="coupon2">返5元红包</div>
            <div class="coupons-menu">></div>
          </div>
        </div>
      </div>
      <div class="foodItem">
        <div class="foodLeft">
          <img class="img_logo" src="../assets/img/sj08.png"/>
        </div>
        <div class="foodRight">
          <div class="right-header">
            <div class="header-tag">爆红包</div>
            <div class="header-text">茶兮鲜果饮品(国...</div>
            <i class="fas fa-times"></i>
          </div>
          <div class="details">
            <div class="details-mark">4.6分</div>
            <div class="details-count">月售600+</div>
            <div class="details-time">40分钟 4km</div>
          </div>
          <div class="delivery">
            <div class="start-price">起送￥20</div>
            <div class="delivery-price">￥3</div>
            <div class="original-price">￥5</div>
            <div class="delivery-tag">蜂鸟准时达</div>
          </div>
          <div class="evaluation">
            <div class="evaluation-title-fire">🥤</div>
            <div class="evaluation-content2">近期超50人复购</div>
          </div>
          <div class="coupons">
            <div class="coupon1">
              👑6元无门槛
            </div>
            <div class="coupon2">返3元无门槛红包</div>
            <div class="coupons-menu">></div>
          </div>
        </div>
      </div>
    </div>
  </div>
  </body>
</template>

<style scoped>
.wrapper{
  width: 100%;
  height: 100%;
}
/*顶部样式*/
.wrapper .header {
  width: 100%;
  display: flex;
  flex-direction: row;
  align-items: center;
  height: 12vw;
  font-size: 5vw;
  font-weight: bolder;
  position: sticky;
  top: 0;
  background-color: white;
}
/*recommend 样式*/
.wrapper .recommend{
  margin-top: 3vw;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
  align-items: center;
  background-color: #f5fcfc;
}
.wrapper .recommend i{
  color: #666666;
  font-size: 3.8vw;
  cursor: pointer;
}
.wrapper .recommend .recommendItem{
  color: #666666;
  align-items: center;
  justify-content: center;
  width:22%;
  height: 5vw;
  font-size: 3.5vw;
  cursor: pointer;
  background-color: white;
  border-radius: 5px;
  text-align: center;
}
.wrapper .recommend .selected{
  color: #00A6EB;
  font-family: 幼圆;
}

/*食品列表*/
.wrapper .foodList {
  margin-bottom: 14vw;
  width: 100vw;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  background-color: #f5fcfc;
}

.wrapper .foodList .foodItem {
  width: 90%;
  height: 35vw;
  margin-top: 5vw;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  background-color: white;
  border-radius: 8px;
}

.wrapper .foodList .foodItem .foodLeft{
  display: flex;
  flex-direction: column;
  flex:2;
  margin-left: 2vw;
}

.wrapper .foodList .foodItem .foodLeft .img_top{
  width:3.5vw;
  z-index: 99;
}
.wrapper .foodList .foodItem .foodLeft .img_logo{
  width:26vw;
  margin-top: -3vw;
}
.wrapper .foodList .foodItem .foodRight{
  display: flex;
  width: 100%;
  margin-left: 2vw;
  flex-direction: column;
  flex:8;
  justify-content: center;
}
.wrapper .foodList .foodItem .foodRight .right-header{
  display: flex;
  flex-direction: row;
  align-items: center;
}
.wrapper .foodList .foodItem .foodRight .right-header .header-tag{
  color: white;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: orangered;
  border-radius: 4px;
  flex:2;
  font-size: 3.2vw;
  height: 4.2vw;
}
.wrapper .foodList .foodItem .foodRight .right-header .header-text{
  font-weight: bolder;
  flex:7;
  margin-left: 1vw;
  font-size: 4.6vw;
}
.wrapper .foodList .foodItem .foodRight .right-header i{
  text-align: right;
  margin-right: 2vw;
  flex:1;
  color: #999999;
  font-size: 3.1vw;
}
.wrapper .foodList .foodItem .foodRight .details{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: 1vw;
}
.wrapper .foodList .foodItem .foodRight .details .details-mark{
  font-size: 4.3vw;
  color: orange;
  text-align: left;
}
.wrapper .foodList .foodItem .foodRight .details .details-count{
  margin-left: 1.5vw;
  color: #999999;
  font-size: 3.5vw;
  flex:4;
}
.wrapper .foodList .foodItem .foodRight .details .details-time{
  text-align: right;
  font-size: 3.5vw;
  color: #666666;
  flex:4;
  margin-right: 1vw;
}
.wrapper .foodList .foodItem .foodRight .delivery{
  width: 100%;
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: 1vw;
}
.wrapper .foodList .foodItem .foodRight .delivery .start-price{
  color:#999999;
  font-size: 3.5vw;
}
.wrapper .foodList .foodItem .foodRight .delivery .delivery-price{
  color:#999999;
  font-size: 3.5vw;
  margin-left: 1vw;
}
.wrapper .foodList .foodItem .foodRight .delivery .original-price{
  font-size: 3.3vw;
  color: #999999;
  text-decoration: line-through;
  text-align: left;
}
.wrapper .foodList .foodItem .foodRight .delivery .delivery-tag{
  display: flex;
  flex-direction: row;
  align-items:center;
  justify-content: center;
  font-size: 3vw;
  color: #17BAF9;
  height: 4vw;
  border: lightskyblue 1px solid;
  border-radius: 3px;
  margin-right: 2vw;
  margin-left: auto;
  width: 16vw;
}
.wrapper .foodList .foodItem .foodRight .evaluation{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: 1vw;
  height: 5vw;
}
.wrapper .foodList .foodItem .foodRight .evaluation .evaluation-title{
  display: flex;
  justify-content: center;
  color: #905e33;
  background-color: #fad6b2;
  font-size: 3.6vw;
  border-radius: 3px;
  width:19%;
  font-family: 方正粗黑宋简体;
  text-align: center;
}
.wrapper .foodList .foodItem .foodRight .evaluation .evaluation-title-fire{
  font-size: 3.6vw;
  color: #fa832b;
  background-color: #f8d8b7;
  width: 10%;
  display: flex;
  justify-content: center;
  border-radius: 3px;
}
.wrapper .foodList .foodItem .foodRight .evaluation .evaluation-content{
  font-size: 3.3vw;
  background-color: #fdf5e0;
  color: #b49974;
  border-radius: 3px;
  text-align: left;
}
.wrapper .foodList .foodItem .foodRight .evaluation .evaluation-content2{
  font-size: 3.2vw;
  background-color: #fdf6e4;
  color: #db8136;
  border-radius: 3px;
  text-align: left;
}

.wrapper .foodList .foodItem .foodRight .coupons{
  display: flex;
  flex-direction: row;
  margin-top: 2vw;
}
.wrapper .foodList .foodItem .foodRight .coupons .coupon1{
  color: #c28f54;
  text-align: center;
  border-radius: 3px;
  border: 1px #b5a79a solid;
  font-size: 3.3vw;
  width: 35%;
  margin-left: 1vw;
}
.wrapper .foodList .foodItem .foodRight .coupons .coupon2{
  color: #eb6f5d;
  font-size: 3.3vw;
  margin-left: 1vw;
  border:#d89e8d 1px solid;
  text-align: center;
  border-radius: 3px;
}
.wrapper .foodList .foodItem .foodRight .coupons .coupons-menu{
  display: flex;
  color:#999999;
  font-size: 3.3vw;
  margin-left: auto;
  margin-right: 2vw;
}
</style>