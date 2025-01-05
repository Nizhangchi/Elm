<script setup lang="ts">
import { ref, onMounted } from 'vue';
import axios from 'axios';
import router from "@/router";

// 定义订单数据
const orders = ref([]);

// 返回按钮逻辑
const returnIcon = () => {
  router.push('/personal');
}

// 获取所有订单
const fetchOrders = async () => {
  try {
    const response = await axios.get('http://localhost:8080/customer/getAllOrdersByCsId', {
      params: {
        id: 1 // 假设当前用户的ID是1，实际应用中应从登录信息中获取
      }
    });
    if (response.data.code === 200) {
      orders.value = response.data.data; // 将获取的订单数据赋值给 orders
    } else {
      console.error('获取订单失败');
    }
  } catch (error) {
    console.error('获取订单请求失败', error);
  }
}

// 在组件挂载时获取订单
onMounted(() => {
  fetchOrders();
});
</script>
<template>
  <body>
  <div class="total">
    <div class="header">
      <div class="returnButton" @click="returnIcon" style="font-size: 20px"><</div>
      <div class="search-panel">
        <i style="padding-left: 3vw; font-size: 4vw;color: #999999;" >🔍</i>
        <input style="outline: none;border: none;border-radius: 10px" type="text"/>
      </div>
      <div class="boxButton">🧰</div>
      <div class="moreButton"><i class="fa fa-ellipsis-h"></i></div>
    </div>
    <div class="orderType">
      <div class="orderTypeItem-selected">
        <div style="font-size: large" class="item-text">全部</div>
        <div style="color: #17BAF9;font-size: 10vw" class="decoration">—</div>
      </div>
      <div class="orderTypeItem">进行中</div>
      <div class="orderTypeItem">待评价</div>
      <div class="orderTypeItem">退款</div>
    </div>
    <div class="monthly">
      <div class="left-content"><span style="font-size: larger">6月</span> &nbsp;&nbsp;支出￥<span style="font-size: larger;font-weight: bolder">97</span>.89</div>
      <div class="level">
        <img style="width: 10%;margin-left: 1vw" src="../assets/img/level.png">
        <div class="level-text">本月冲击铂金还差100成长值</div> >
      </div>
    </div>
    <div class="orderCard">
      <div class="cardTitle">
        <div class="shop-picture"><img style="width: 100%" src="../assets/img/business/腊排骨1.png"></div>
        <div class="shop-details">
          <div class="shop-name">
            正宗丽江腊排骨 &nbsp;>
            <div class="condition">进行中</div>
          </div>
          <div class="shop-discount">
            <div class="discount1">&nbsp;7元无门槛&nbsp;</div>
            <div class="discount2">&nbsp;38减3&nbsp;</div>
          </div>
        </div>
      </div>
      <div class="card-content">
        <div class="left-content">
          <div class="picture">
            <img style="width: 35%" src="../assets/img/business/腊排骨2.png">
            <img style="width: 35%" src="../assets/img/business/腊排骨3.png">
          </div>
          <div class="date">2024-06-07 19:27:39</div>
        </div>
        <div class="right-content">
          <div class="price">￥<span style="font-size: larger">20</span>.44</div>
          <div class="count">共2件</div>
        </div>
      </div>
      <div class="card-bottom">再来一单</div>
    </div>
    <div class="orderCard">
      <div class="cardTitle">
        <div class="shop-picture"><img style="width: 100%" src="../assets/img/business/1..logo.png"></div>
        <div class="shop-details">
          <div class="shop-name">
            一点点(昆明大学城店) &nbsp;>
            <div class="condition">已送达</div>
          </div>
          <div class="shop-discount">
            <div class="discount1">&nbsp;6元无门槛&nbsp;</div>
          </div>
        </div>
      </div>
      <div class="card-content">
        <div class="left-content">
          <div class="picture">
            <img style="width: 35%" src="../assets/img/business/1..15.png">
            <img style="width: 35%" src="../assets/img/business/1..11.png">
          </div>
          <div class="date">2024-06-05 17:16:29</div>
        </div>
        <div class="right-content">
          <div class="price">￥<span style="font-size: larger">28</span></div>
          <div class="count">共2件</div>
        </div>
      </div>
      <div class="card-bottom">再来一单</div>
    </div>
    <div class="orderCard2">
      <div class="cardTitle">
        <div class="shop-picture"><img style="width: 100%" src="../assets/img/business/yaojiwang.jpg"></div>
        <div class="shop-details">
          <div class="shop-name">
            窑鸡王(昆明春融街店) &nbsp;>
            <div class="condition">已送达</div>
          </div>
          <div class="shop-discount">
            <div class="discount3">&nbsp;超出配送范围&nbsp;</div>
          </div>
        </div>
      </div>
      <div class="card-content">
        <div class="left-content">
          <div class="picture">
            <img style="width: 35%" src="../assets/img/business/chicken.png">
            <div class="food-text">招牌窑鸡★★ 半只-原味</div>
          </div>

          <div class="date">2024-06-07 19:27:39</div>
        </div>
        <div class="right-content">
          <div class="price">￥<span style="font-size: larger">35</span>.4</div>
          <div class="count">共2件</div>
        </div>
      </div>
      <div class="recommendMore">
        <div class="recommend"><i class="fa-solid fa-shop"></i> <span style="font-weight: bolder">更多推荐</span> <span style="color:#999999;">|</span> 窑鸡王(昆明大学城店)</div>
        <div class="goto">去看看&nbsp;></div>
      </div>
    </div>
    <div class="orderCard2">
      <div class="cardTitle">
        <div class="shop-picture"><img style="width: 100%" src="../assets/img/business/goodme_logo.png"></div>
        <div class="shop-details">
          <div class="shop-name">
            古茗(北大街店) &nbsp;>
            <div class="condition">已送达</div>
          </div>
          <div class="shop-discount">
            <div class="discount3">&nbsp;超出配送范围&nbsp;</div>
          </div>
        </div>
      </div>
      <div class="card-content">
        <div class="left-content">
          <div class="picture">
            <img style="width: 35%" src="../assets/img/business/goodme.png">
            <img style="width: 35%" src="../assets/img/business/goodme2.png">
          </div>

          <div class="date">2024-06-07 19:27:39</div>
        </div>
        <div class="right-content">
          <div class="price">￥<span style="font-size: larger">26</span></div>
          <div class="count">共2件</div>
        </div>
      </div>
      <div class="recommendMore">
        <div class="recommend"><i class="fa-solid fa-shop"></i> <span style="font-weight: bolder">更多推荐</span> <span style="color:#999999;">|</span> 古茗(时代俊园店)</div>
        <div class="goto">去看看&nbsp;></div>
      </div>
    </div>
  </div>
  </body>

</template>

<style scoped>
.total{
  width: 100%;
  height: 320vw;
  background-color: #f5fcfc;
}
.total .header{
  display: flex;
  flex-direction: row;
  height: 14vw;
  align-items: center;
  justify-content: space-around;
  font-weight: lighter;
  position: fixed;
  background-color: #f5fcfc;
  width: 100%;
  top: 0;
}
.total .header .returnButton{
  margin-left: 3vw;
}
.total .header .search-panel{
  width: 65%;
  height: 80%;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
}
.total .header .search-panel input{
  width: 100%;
  height: 50%;
}
.total .header .search-panel i{
  margin-right: -5vw;
  z-index: 9;
  font-size: 5vw;
}
.total .header .boxButton i,
.total .header .moreButton i{
  font-size: 5vw;
  margin-right: 2vw;
}
/*订单类型*/
.total .orderType{
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  height: 10vw;
  width: 100%;
  position: fixed;
  top: 14vw;
  background-color: #f5fcfc;
}
.total .orderType .orderTypeItem-selected{
  display: flex;
  flex-direction: column;
  align-items: center;
  font-weight: bold;
}
.total .orderType .orderTypeItem-selected .decoration{
  margin-top: -4vw;
}
/*每月记账栏*/
.total .monthly{
  width: 100%;
  height: 8vw;
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: 24vw;
}
.total .monthly .left-content{
  margin-left: 3vw;
  font-size: 3.8vw;
}
.total .monthly .level{
  margin-left: auto;
  width: 58%;
  height: 60%;
  display: flex;
  flex-direction: row;
  align-items: center;
  font-size: 3.5vw;
  border-radius: 10px;
  background-color: #fdfef9;
}
.total .monthly .level .level-text{
  margin-right: 1vw;
  margin-left: 1vw;
}
.total .monthly .level i{
  font-size: 3vw;
  color: #999999;
}
/*订单卡片*/
.total .orderCard{
  border-radius: 8px;
  width: 95%;
  margin-left: 2vw;
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  background-color: white;
  height: 65vw;
  margin-top: 3vw;
  margin-bottom: 2vw;
}
.total .orderCard2{
  border-radius: 8px;
  width: 95%;
  margin-left: 2vw;
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  background-color: white;
  height: 80vw;
  margin-top: 3vw;
  margin-bottom: 2vw;
}
.total .cardTitle{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-left: 2vw;
  margin-top: 3vw;
}
.total .cardTitle .shop-picture{
  width: 15%;
}
.total .cardTitle .shop-details{
  width: 100%;
  height: 12vw;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  margin-left: 2vw;
}
.total .cardTitle .shop-details .shop-name {
  display: flex;
  flex-direction: row;
  align-items: center;
  font-size: 4.5vw;
}
.total .cardTitle .shop-details .shop-name .condition{
  display: flex;
  flex-direction: row;
  margin-left: auto;
  font-size: 4vw;
  font-weight: lighter;
  color: #9F9F9F;
  margin-right: 3vw;
}
.total .cardTitle .shop-details .shop-discount {
  display: flex;
  flex-direction: row;
  align-items: center;
  font-size: 3.5vw;
}
.total .cardTitle .shop-details .shop-discount .discount1{
  border-radius: 5px;
  border: #bfbea0 1px solid;
  color: #8c7250;
  display: flex;
  align-items: center;
  justify-content: center;
  height: 4.3vw;
}
.total .cardTitle .shop-details .shop-discount .discount2{
  border: #fb664f 1px solid;
  color: #fb664f;
  border-radius: 5px;
  display: flex;
  align-items: center;
  justify-content: center;
  margin-left: 1vw;
  height: 4.3vw;
}
.total .cardTitle .shop-details .shop-discount .discount3{
  background-color:#959394;
  color: white;
  border-radius: 5px;
  display: flex;
  align-items: center;
  justify-content: center;
  margin-left: 1vw;
  height: 5vw;
}

.total .card-content{
  width: 100%;
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: 3vw;
}
.total .card-content .left-content{
  display: flex;
  flex-direction: column;
  margin-left: 2vw;
}
.total .card-content .left-content .picture{
  display: flex;
  flex-direction: row;
  width: 85%;
}
.total .card-content .left-content .picture img{
  margin-left: 1vw;
}
.total .card-content .left-content .picture .food-text{
  width: 100%;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  font-size: 3.8vw;
}
.total .orderCard .card-content .left-content .date{
  color: #9F9F9F;
  font-size: 3.8vw;
  margin-top: 2vw;
}
.total .card-content .right-content{
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  margin-right: 3vw;
}
.total .card-content .right-content .price {
  font-weight: bolder;
}
.total .card-content .right-content .count{
  font-size: 3.5vw;
  color: #9F9F9F;
  margin-top: 3vw;
}
.total .card-bottom{
  display: flex;
  align-items: center;
  justify-content: center;
  height: 8.5vw;
  border: 1px #17BAF9 solid;
  color: #17BAF9;
  border-radius: 20px;
  margin-left: auto;
  margin-right: 3vw;
  margin-bottom: 3vw;
  width: 23%;
}
.total .recommendMore{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-left: 2vw;
  margin-right: 3vw;
}
.total .recommendMore .goto{
  color: #9F9F9F;
  font-size: smaller;
  margin-left: auto;
}
</style>