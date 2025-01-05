<script setup lang="ts">
import { defineComponent } from 'vue';
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

// export default defineComponent({
//   methods: {
//     select(element) {
//       if (element.classList.contains("far")) {
//         element.classList.remove("far", "fa-circle", "before");
//         element.classList.add("fa-regular", "fa-circle-check", "after");
//       } else {
//         element.classList.remove("fa-regular", "fa-circle-check", "after");
//         element.classList.add("far", "fa-circle", "before");
//       }
//     },
//     selectAll(element) {
//       if (element.classList.contains("far")) {
//         var elements1 = document.querySelectorAll(".far.fa-circle");
//         elements1.forEach(function (element) {
//           element.classList.remove("far", "fa-circle","before");
//           element.classList.add("fa-regular", "fa-circle-check","after");
//         });
//       } else {
//         var elements2 = document.querySelectorAll(".fa-regular.fa-circle-check");
//         elements2.forEach(function (element) {
//           element.classList.remove("fa-regular", "fa-circle-check","after");
//           element.classList.add("far", "fa-circle","before");
//         });
//       }
//     },
//     marketTag() {
//       this.$router.push('/market');
//     },
//   },
// });
</script>

<template>
  <body>
  <div class="total">
    <div class="header">
      <div class="text">购物车</div>
      <div class="location">
        云南大学呈贡校区(南一门) >
      </div>
      <div class="editIcon">
        <i class="fas fa-pencil-alt"></i>
      </div>
    </div>
    <div class="tag">
      <div class="tag-usual">
        <i class="fas fa-receipt"></i>
        <div class="tag-text">我常买</div>
      </div>
      <div class="tag-market" @click="marketIcon">
        <i class="fa-solid fa-store"></i>
        <div class="tag-text"> 全能超市 ></div>
      </div>
    </div>
    <div class="body">
      <div class="card">
        <div class="title">
          <div class="name">
            <i class="far fa-circle before"></i>1点点(第七街区店) >
          </div>
          <div class="time">
            53分钟 <i class="fas fa-trash-alt"></i>
          </div>
        </div>
        <div class="delivery">
          配送费减4
        </div>
        <div class="content">
          <div class="icon"><i class="far fa-circle"></i></div>
          <div class="picture">
            <img src="../assets/img/business/GrapefruitGreen.jpg" style="width: 60%;">
          </div>
          <div class="detail">
            <div class="name">葡萄柚绿</div>
            <div class="choice">
              大杯/三分糖/少冰/茉莉绿茶/不...<i class="fa-solid fa-chevron-down"></i>
            </div>
            <div class="bottom-text">
              <div class="price">￥18</div>
              <div class="number">x1</div>
            </div>

          </div>
        </div>
      </div>

      <div class="card">
        <div class="title">
          <div class="name">
            <i  class="far fa-circle before"></i>古茗(仕林街店) >
          </div>
          <div class="time">
            40分钟 <i class="fas fa-trash-alt"></i>
          </div>
        </div>
        <div class="delivery">
          配送费减4
        </div>
        <div class="content">
          <div class="icon"><i  class="far fa-circle"></i></div>
          <div class="picture">
            <img src="../assets/img/business/goodme.png" style="width: 60%;">
          </div>
          <div class="detail">
            <div class="name">龙井香青团</div>
            <div class="choice">
              大/少冰/默认糖/五分甜/普通杯/...<i class="fa-solid fa-chevron-down"></i>
            </div>
            <div class="bottom-text">
              <div class="price">￥14</div>
              <div class="number">x1</div>
            </div>

          </div>
        </div>
      </div>

      <div class="card">
        <div class="title">
          <div class="name">
            <i  class="far fa-circle before"></i>东北麻辣烫麻辣拌米线... >
          </div>
          <div class="time">
            60分钟 <i class="fas fa-trash-alt"></i>
          </div>
        </div>
        <div class="delivery">
          配送费减1
        </div>
        <div class="content">
          <div class="icon"><i  class="far fa-circle"></i></div>
          <div class="picture">
            <img src="../assets/img/business/malatang.png" style="width: 60%;">
          </div>
          <div class="detail">
            <div class="name">全素麻辣烫</div>
            <div class="choice">
              放芝麻酱/微辣<i class="fa-solid fa-chevron-down"></i>
            </div>
            <div class="bottom-text">
              <div class="now-price" style="flex: 1">￥20.4</div>
              <div class="original-price" style="flex:6;color: #9F9F9F;font-size: smaller;text-decoration: line-through;">￥20.8</div>
              <div class="number" >x1</div>
            </div>

          </div>
        </div>
      </div>

      <div class="card" style="height: 70vw">
        <div class="title">
          <div class="name">
            <i  class="far fa-circle before"></i>古茗(呈贡店) >
          </div>
          <div class="time">
            48分钟 <i class="fas fa-trash-alt"></i>
          </div>
        </div>
        <div class="delivery">
          配送费减4
        </div>
        <div class="content-total">
          <div class="content">
            <div class="icon"><i class="far fa-circle"></i></div>
            <div class="picture">
              <img src="../assets/img/business/goodme2.png" style="width: 60%;">
            </div>
            <div class="detail">
              <div class="name">百香双重奏</div>
              <div class="choice">
                中/不去料/少冰/五分甜/茉莉/...<i class="fa-solid fa-chevron-down"></i>
              </div>
              <div class="bottom-text">
                <div class="now-price" style="flex: 1">￥12.35</div>
                <div class="original-price" style="flex:6;color: #9F9F9F;font-size: smaller;text-decoration: line-through;">￥13</div>
                <div class="number">x1</div>
              </div>
            </div>
          </div>
          <div class="content">
            <div class="icon"><i class="far fa-circle"></i></div>
            <div class="picture">
              <img src="../assets/img/business/goodme2.png" style="width: 60%;">
            </div>
            <div class="detail">
              <div class="name">百香双重奏</div>
              <div class="choice">
                大/不去料/少冰/五分甜/茉莉/...<i class="fa-solid fa-chevron-down"></i>
              </div>
              <div class="bottom-text">
                <div class="price">￥15</div>
                <div class="number">x1</div>
              </div>

            </div>

          </div>
        </div>

      </div>

    </div>
    <div class="usual">
      <div class="top-tag">
            <span>
            <i class="fas fa-receipt"></i>我常买
        </span>
      </div>
      <div class="usual-content">您在云南大学呈贡校区(南1门)附近没有常购门店哦</div>
    </div>
    <div class="blank"> </div>
    <div class="collection">
      <div class="all">
        <!-- 未选中状态 -->
        <i class="far fa-circle"></i>全选
      </div>
      <div class="button">
        <div class="button-text">结算</div>
        <div class="count">0个商家</div>
      </div>
    </div>
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
      <div @click="shoppingIcon" class="selected">
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
.after{
  color: #17BAF9;
}
.before{
  color: #999999;
}
/*顶栏样式*/
.total .header{
  width: 100%;
  height: 18vw;
  background-color: #f5fcfc;
  display: flex;
  flex-direction: row;
  align-items: center;
  position: fixed;
}
.total .header .text{
  margin-left: 4vw;
  font-size: 6vw;
  flex:2;
  font-weight: bolder;
}
.total .header .location {
  margin-left: 2vw;
  flex: 7;
  font-size: 4vw;
  font-weight: bold;
}
.total .header .location i{
  font-size: 3vw;
  cursor: pointer;
}
.total .header .editIcon{
  flex: 1;
  font-size: 5vw;
  cursor: pointer;
  margin-right: 2vw;
}
/*tag样式*/
.total .tag{
  height: 16vw;
  width: 100%;
  display: flex;
  flex-direction: row;
  padding-top: 16vw;
  justify-content: center;
  align-items: center;
  background-color: #f5fcfc;
}

.total .tag .tag-usual,
.total .tag .tag-market{
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: white;
  border-radius: 10px;
  border: 1px solid white;
  width: 45%;
  height: 10vw;
  margin-left: 1vw;
  margin-right: 1vw;
}
.total .tag i{
  font-size: 4vw;
  color: #17BAF9;
}

.total .tag .tag-text{
  margin-left: 3vw;
  font-size: 3.8vw;
  font-weight: bold;
}

/*购物车卡片样式*/
.total .body{
  width: 100%;
  flex-direction: column;
  background-color: #f5fcfc;
}
.total .body .card{
  width: 93%;
  height: 45vw;
  margin-left: 3vw;
  display: flex;
  flex-direction: column;
  background-color: white;
  border-radius: 10px;
  margin-bottom: 10px;
}
.total .body .card .title{
  width: 100%;
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: 3vw;
}
.total .body .card .title .name{
  flex:3;
  font-size: 4.5vw;
  margin-left: 3vw;
  font-weight: bold;
}
.total .body .card .title .name i{
  margin-right: 1vw;
}
.total .body .card .title .time{
  flex:1;
  text-align: right;
  margin-right: 3vw;
  color: #9F9F9F;
  font-size: 3.5vw;
}
.total .body .card .delivery{
  border: salmon 1px solid;
  border-radius: 3px;
  width: 16%;
  font-size: 3vw;
  color: red ;
  margin-left: 10vw;
  margin-top: 3vw;
  display: flex;
  flex-direction:row;
  justify-content: center;
}
.total .body .card .content{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: 3.6vw;
}
.total .body .card .content .icon{
  color: #999999;
  flex: 1;
  margin-left: 3vw;
  font-size: 5vw;
}
.total .body .card .content .picture{
  flex:5;
}
.total .body .card .content .detail{
  display: flex;
  flex-direction: column;
  flex: 8;
  margin-right: 3vw;
  margin-left: -10vw;
}
.total .body .card .content .detail .name{
  font-size: 4.2vw;
  font-weight: bold;
  text-align: left;
}
.total .body .card .content .detail .choice{
  font-size: 3.3vw;
  color: #999999;
  margin-top: 2vw;
  text-align: left;
}
.total .body .card .content .detail .bottom-text{
  display: flex;
  height: 6vw;
  margin-top: 2vw;
  align-items: center;
  flex-direction: row;
  font-weight: bold;
  font-size: 4vw;
}
.total .body .card .content .detail .bottom-text .price{
  flex:8;
}
.total .body .card .content .detail .bottom-text .number{
  display: flex;
  flex:1;
  justify-content: center;
  align-items: center;
  text-align: right;
  border: lightgray 1px solid;
  border-radius: 7px;
}

/*常买*/
.total .usual{
  height: 15vw;
  background-color: #f5fcfc;
  display: flex;
  padding-top: 5vw;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.total .usual .top-tag{
  width: 90%;
  height: 1px;
  background-color: lightgray;
  display: flex;
  align-items: center;
  justify-content: center;
  margin-left: 5vw;
}
.total .usual .top-tag span{
  padding: 0 10px; /* 调整文本与分割线之间的间距 */
  color: black; /* 文本颜色 */
  justify-content: center;
  background-color: #f5fcfc;
  font-size: 4vw;
}
.total .usual .top-tag span i{
  margin-right: 3vw;
}
.total .usual .usual-content{
  height: 5vw;
  padding-top: 5vw;
  font-size: 3.5vw;
  color: #9F9F9F;
}

.total .blank{
  height: 100vw;
  background-color: #f5fcfc;
}
/*结算栏*/
.total .collection{
  width: 100%;
  height: 14vw;
  background-color: white;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  position: fixed;
  left: 0;
  bottom: 14vw;
}

.total .collection .all{
  flex:5;
  margin-left: 6vw;
  align-items: center;
  font-size: 4vw;
}
.total .collection .all i{
  height: 5vw;
  font-size: 5vw;
  margin-right: 2vw;
}
.total .collection .button{
  flex: 2;
  width: 10vw;
  height: 12vw;
  border-radius: 30px;
  background-color: #17BAF9;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  margin-right: 3vw;
  cursor: pointer;
}
.total .collection .button .button-text{
  font-size: 4.2vw;
  color: white;
}
.total .collection .button .count{
  font-size: 3vw;
  color: white;
}



.total .blank{
  height: 25vw;
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