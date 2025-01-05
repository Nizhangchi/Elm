<script setup lang="ts">
import router from "@/router";
import { ref } from 'vue';
import axios from 'axios';

const username = ref('');
const password = ref('');
const agreeTerms = ref(false);

const login = async () => {
  if (!agreeTerms.value) {
    alert('请勾选隐私条款政策！');
    return;
  }
  if (!username.value || !password.value) {
    alert('手机号或验证码输入错误！');
    return;
  }
  try {
    const response = await axios.post('/api/login', {
      username: username.value,
      password: password.value
    });
    if (response.data.success) {
      router.push('/index');
    } else {
      alert(response.data.message);
    }
  } catch (error) {
    console.error(error);
    alert('Login failed. Please try again.');
  }
};
const closeIcon = () => {
  router.push('/before-login')
}
const login2 = () => {
  router.push('/LoginByPwd')
}

</script>

<template>
  <body>
  <div class="total">
    <div class="header">
      <div class="close-icon" @click="closeIcon">
        <i class="fas fa-times" ></i>
      </div>
      <div class="header-text" @click="login2">密码登录</div>
    </div>
    <div class="body">
      <div class="title">手机号登录</div>
      <div class="input">
        <input id="phoneNumber" type="text" placeholder="请输入手机号">
        <div class="input-verification">
          <input type="password" placeholder="验证码" v-model="password" />
          <div class="get-button">获取验证码</div>
        </div>
      </div>
      <div class="login-button" @click="login">登录</div>
      <div class="know">
        <label for="checkbox1"></label>
        <input type="checkbox" id="checkbox1" v-model="agreeTerms" />
        未注册手机号登陆后将自动生成账号，且代表您已阅读并同意<span style="color: #17BAF9">《用户服务协议》、《隐私政策》</span>
      </div>
      <div class="question">
        遇到问题
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
/*header样式*/
.total .header{
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  height: 10vw;
  margin-top: 3vw;
}
.total .header .close-icon{
  margin-left: 6vw;
  font-size: 6vw;
}
.total .header .header-text{
  margin-left: auto;
  margin-right: 5vw;
  font-size: 4.5vw;
}
.total .body{
  width: 100%;
  display: flex;
  flex-direction: column;
}
.total .body .title{
  height: 30vw;
  display: flex;
  flex-direction: row;
  align-items: center;
  font-size: 8vw;
  font-weight: bold;
  margin-left: 6vw;
}
/*手机号验证码样式*/
.total .body .input{
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 100%;
  font-size: 4.2vw;
}
.total .body .input input{
  height: 13vw;
  outline: medium;
  border-top:none;
  border-bottom:1px solid grey;
  border-left:none;
  border-right:none;
  width: 85%;
}
.total .body .input-verification{
  display: flex;
  flex-direction: row;
  align-items: center;
  width: 86%;
  border-bottom: grey 1px solid;
  font-size: 4.2vw;
}
.total .body .input-verification input{
  height:13vw;
  outline: medium;
  border: none;
}
.total .body .input .get-button{
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  border: 1px solid grey;
  border-radius: 20px;
  color: #999999;
  width: 30%;
  height: 7vw;
  font-size: 3.6vw;
  cursor: pointer;
}
/*登录按钮样式*/
.total .body .login-button{
  width: 85%;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  cursor: pointer;
  height: 9vw;
  border-radius: 20px;
  background-color: lightgray;
  margin-left: 6vw;
  margin-top: 13vw;
  color: #999999;
}
/*用户须知*/
.total .body .know{
  width: 85%;
  margin-left: 6vw;
  margin-top: 5vw;
  font-size: 3.3vw;
  color: #999999;
}
/*遇到问题*/
.total .body .question{
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  color: #17BAF9;
  font-size: 4vw;
  margin-top: 100vw;
}
</style>