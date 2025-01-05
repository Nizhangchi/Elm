<script setup lang="ts">
import { useRouter } from 'vue-router';
const router = useRouter();
const returnIcon = () => {
  router.push('/alittletea')
}
</script>

<template>
  <body>
  <div class="total">
    <div class="header">
      <i @click="returnIcon"><</i>
      <div class="header-title">确认订单</div>
    </div>
    <div class="body">
      <div class="notice">
        <span style="margin-left: 2vw">🔈</span>温馨提示：请适量点餐，避免浪费
      </div>
      <div class="distribution">
        <div class="address">云南大学呈贡校区(南1门)南门 <span style="margin-left: auto;margin-right: 2vw">></span></div>
        <div class="user">王  195****2337 &nbsp; &nbsp;<i class="fa-solid fa-pencil "></i></div>
        <div class="tip">根据你选择地址自动填写</div>
        <div class="delivery">立即送出 <span style="font-size: 3.8vw;margin-left: auto;color: #428870">预计 17:52送达&nbsp;>&nbsp;</span></div>
        <div class="tip">商家已赠送慢必赔,超时10分钟起享赔付 <i class="fa-regular fa-circle-question "></i></div>
      </div>
      <div class="details">
        <div class="business">
          1点点（昆明大学城店）
          <div class="fengniao">蜂鸟准时达</div>
          <i style="margin-right: 2vw" class="fa-regular fa-circle-question "></i>
        </div>
        <div class="goods">
          <div class="picture">
            <img style="width: 100%" src="../assets/img/business/GrapefruitGreen.jpg">
          </div>
          <div class="goods-details">
            <div class="line1">
              <div class="left-text">葡萄柚绿-大杯</div>
              <div class="right-text"><span style="font-size: small">￥</span>18</div>
            </div>
            <div class="line2">大杯/三分糖/少冰/茉莉绿茶</div>
            <div class="line3">x 1</div>
          </div>
        </div>
        <div class="packingFee">
          <div class="left-text">打包费 <i style="color: #9F9F9F" class="fa-regular fa-circle-question "></i></div>
          <div class="right-text"><span style="font-size: smaller">￥</span>1</div>
        </div>
        <div class="deliveryFee">
          <div class="logo">减</div>
          <div class="left-text">配送费 <i style="color: #9F9F9F" class="fa-regular fa-circle-question "></i></div>
          <div class="right-text"><span style="color: #9F9F9F;text-decoration: line-through">￥5</span><span style="font-size: smaller">￥</span>1</div>
        </div>
        <div class="tips">配送费活动减4元</div>
        <div class="redPacket">
          <div class="logo">￥</div>
          <div class="left-text">饿了么红包</div>
          <div class="right-text">未选红包，最高4元可用 ></div>
        </div>
        <div class="returnBeans">
          <div class="logo">返</div>
          <div class="left-text">下单返豆 <i style="color: #9F9F9F" class="fa-regular fa-circle-question "></i></div>
          <div class="right-text">返120吃货豆</div>
        </div>
        <div class="divider"></div>
        <div class="money">
          <div style="color: #9F9F9F;font-size: 3.5vw" class="left-text">优惠说明 <i class="fa-regular fa-circle-question "></i></div>
          <div class="right-text">已优惠 <span style="color: #fb6242">¥4</span> 小计¥<span style="font-size: larger">20</span></div>
        </div>
      </div>
      <div class="note">
        <div class="remark">
          <div class="remark-left">备注</div>
          <div class="remark-right">请填写口味偏好 ></div>
        </div>
        <div class="tableware">
          <div class="tableware-left">餐具份数</div>
          <div class="tableware-right">您已默认「需要餐具」></div>
        </div>
        <div class="receipt">
          <div class="receipt-left">发票</div>
          <div class="receipt-right">该店不支持线上开票，请电话联系商户</div>
        </div>
      </div>
      <div class="payment">
        <div class="pay">
          <div class="img"><img src="../assets/img/alipay.png" style="width: 90%"></div>
          <div class="button"><i class="far fa-circle"></i></div>
        </div>
        <div class="pay">
          <div class="img"><img src="../assets/img/wechat.png" style="width: 100%"></div>
          <div class="button"><i class="far fa-circle"></i></div>
        </div>
        <div class="pay">
          <div class="img"><img src="../assets/img/cloudpay.png" style="width: 90%"></div>
          <div class="button"><i class="far fa-circle"></i></div>
        </div>
      </div>
      <div class="blank" style="height: 20vw"> </div>
    </div>
    <div class="footer">
      <div class="total-money">
        <div class="top-content">合计 ￥<span style="font-weight: bold;font-size: 5.5vw">20</span></div>
        <div class="bottom-content"><span style="color: #fb6242">已优惠￥4</span>，还有<span style="color: #fb6242">￥4</span>红包未选 <i style="font-size: small" class="fa-solid fa-chevron-right"></i></div>
      </div>
      <div class="commit-button">提交订单</div>
    </div>
  </div>
  </body>
</template>

<style scoped>
.total{
  height: 100%;
  width: 100%;
  background: linear-gradient(#428870,whitesmoke);
}
.after{
  color: #428870;
}
.before{
  color: #999999;
}
/*header样式*/
.total .header{
  width: 100%;
  display: flex;
  flex-direction: row;
  align-items: center;
  height: 12vw;
  position: fixed;
  color: white;
  background-color: #428870;
}
.total .header i{
  flex:2;
  margin-left: 3vw;
}
.total .header .header-title{
  flex:3;
  font-size: 4.5vw;
}

.total .body{
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  background: linear-gradient(#428870,whitesmoke);
}
/*notice样式*/
.total .body .notice{
  width: 92%;
  background-color: #fef6df;
  color: #f18c30;
  border-radius: 8px;
  height: 9vw;
  font-size: 3.5vw;
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top:13vw;
}
/*distribution样式*/
.total .body .distribution{
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 92%;
  background-color: white;
  height: 40vw;
  margin-top: 3vw;
  border-radius: 8px;
}
.total .body .distribution .address{
  display: flex;
  flex-direction: row;
  margin-left: 3vw;
  font-size: 5vw;
  font-weight: bolder;
}
.total .body .distribution .address i{
  margin-left: auto;
  margin-right: 3vw;
  color: #9F9F9F;
  font-size: smaller;
}
.total .body .distribution .user{
  color: #9F9F9F;
  margin-left: 3vw;
  margin-top: 3vw;
  font-size: 4vw;
}
.total .body .distribution .tip{
  margin-left: 3vw;
  margin-top: 1vw;
  color: #17BAF9;
  font-size: smaller;
}
.total .body .distribution .tip i{
  color: #9F9F9F;
}
.total .body .distribution .delivery{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-left: 3vw;
  margin-top: 3vw;
}
.total .body .distribution .delivery i{
  margin-right: 3vw;
  color: #9F9F9F;
  font-size: smaller;
}
.total .body .details{
  width: 92%;
  display: flex;
  flex-direction: column;
  height: 80vw;
  border-radius: 5px;
  background-color: white;
  margin-top: 3vw;
}
.total .body .details .business{
  display: flex;
  flex-direction: row;
  align-items: center;
  color: #999999;
  font-size: 4vw;
  margin-left: 3vw;
  height: 10vw;
}
.total .body .details .business .fengniao{
  font-size: 3.2vw;
  color: #17BAF9;
  border: #f3feff 1px solid;
  border-radius: 5px;
  margin-left: auto;
  margin-right: 2vw;
}
.total .body .details .goods{
  display: flex;
  flex-direction: row;
  align-items: center;
}
.total .body .details .goods .picture{
  width: 20%;
  margin-left: 3vw;
}
.total .body .details .goods .goods-details{
  height: 100%;
  width: 74%;
  margin-left: 3vw;
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  margin-right: 3vw;
}
.total .body .details .goods .goods-details .line1{
  display: flex;
  flex-direction: row;
  font-size: 4.5vw;
}
.total .body .details .goods .goods-details .line1 .right-text{
  margin-left:auto;
}
.total .body .details .goods .goods-details .line2{
  color: #999999;
  font-size: 4vw;
}
.total .body .details .goods .goods-details .line3{
  color: #999999;
  font-size: 3.8vw;
}
.total .body .details .packingFee{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-left: 3vw;
  margin-top: 3vw;
  font-size: 4vw;
}
.total .body .details .packingFee .right-text{
  margin-left: auto;
  margin-right: 3vw;
}
.total .body .details .deliveryFee{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-left: 3vw;
  margin-top: 3vw;
}
.total .body .details .deliveryFee .logo{
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: smaller;
  color: white;
  background-color: #fb664f;
  border-radius: 3px;
}
.total .body .details .deliveryFee .left-text,
.total .body .details .redPacket .left-text,
.total .body .details .returnBeans .left-text{
  margin-left: 1vw;
}
.total .body .details .deliveryFee .right-text{
  margin-left: auto;
  margin-right: 3vw;
}
.total .body .details .tips{
  color: #fb664f;
  font-size: smaller;
  margin-left: 3vw;
}
.total .body .details .redPacket{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-left: 3vw;
  margin-top: 2vw;
}
.total .body .details .redPacket .logo{
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: smaller;
  color: white;
  background-color: #fb664f;
  border-radius: 3px;
}
.total .body .details .redPacket .right-text{
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  margin-left: auto;
  margin-right: 3vw;
  border-radius: 10px;
  color: white;
  background-color: #fb664f;
  height: 5vw;
  font-size: 3.6vw;
  width: 50%;
}
.total .body .details .returnBeans{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-left: 3vw;
  margin-top: 2vw;
}
.total .body .details .returnBeans .logo{
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: smaller;
  color: white;
  background-color: #fb664f;
  border-radius: 3px;
}
.total .body .details .returnBeans .right-text{
  color: #fb664f;
  margin-left: auto;
  margin-right: 3vw;
  font-size: 3.8vw;
}
.total .body .details .divider{
  width: 95%;
  height: 0.6px;
  background-color: lightgray;
  margin-left: 10px;
  margin-top: 5vw;
}
.total .body .details .money{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: 2vw;
  margin-left: 3vw;
}
.total .body .details .money .right-text{
  margin-left: auto;
  margin-right: 3vw;
}
/*note样式*/
.total .body .note{
  width: 92%;
  height: 33vw;
  margin-top: 3vw;
  background-color: white;
  display: flex;
  flex-direction: column;
  align-items: center;
  border-radius: 5px;
}
.total .body .note .remark,
.total .body .note .tableware,
.total .body .note .receipt{
  width: 95%;
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-left: 3vw;
  margin-top: 5vw;
}
.total .body .note i{
  color: #999999;
}
.total .body .note .remark .remark-left,
.total .body .note .receipt .receipt-left,
.total .body .note .tableware .tableware-left{
  font-weight: bolder;
}
.total .body .note .remark .remark-right,
.total .body .note .receipt .receipt-right{
  margin-left: auto;
  color: #999999;
  font-size: 3.5vw;
  margin-right: 2vw;
}
.total .body .note .tableware .tableware-right{
  margin-right: 2vw;
  margin-left: auto;
  font-size: 3.5vw;
}
/*支付样式*/
.total .body .payment{
  width: 92%;
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 3vw;
  background-color: white;
  border-radius: 5px;
  height: 32vw;
}
.total .body .payment .pay{
  display: flex;
  flex-direction: row;
  align-items: center;
  width: 95%;
  margin-top: 3vw;
}
.total .body .payment .pay .img{
  width: 30%;
}
.total .body .payment .pay .button{
  margin-left: auto;
  margin-right: 2vw;
  font-size: 4vw;
  color: #999999;
}
.total .body .payment .pay .button-selected{
  color: #428870;
  margin-left: auto;
  margin-right: 2vw;
  font-size: 4vw;
}

/*footer样式*/
.total .footer{
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: end;
  background-color: white;
  position: fixed;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 15vw;
}
.total .footer .total-money{
  display: flex;
  flex-direction: column;
  align-items: end;
  margin-right: 2vw;
}
.total .footer .total-money .top-content{
  font-size: 4vw;
  margin-top: 1vw;
}
.total .footer .total-money .bottom-content{
  color: #999999;
  font-size: 3.5vw;
  margin-top: 1vw;
}
.total .footer .commit-button{
  display: flex;
  align-items: center;
  justify-content: center;
  color: white;
  background-color: #428870;
  border-radius: 20px;
  height: 10vw;
  width: 25%;
  margin-right: 4vw;
  cursor: pointer;
}

</style>