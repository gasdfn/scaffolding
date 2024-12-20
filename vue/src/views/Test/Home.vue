
<template>
  <div>
<div class="card">
欢迎使用本系统

</div>
  </div>
</template>

<script setup>
// 写一个请求
import request from "@/utils/request.js";

request.get('/test/hello').then(res => {
  console.log(res)
})
</script>