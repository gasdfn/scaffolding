<template>
  <div class="manager-container">
    <div class="manager-header">
      <div class="manager-header-left">
        <img src="@/assets/imgs/logo.png" alt="">
        <div class="title">管理系统</div>
      </div>
      <div class="manager-header-center">
        <el-breadcrumb separator="/">
          <el-breadcrumb-item :to="{ path: '/manager/home' }">系统首页</el-breadcrumb-item>
          <el-breadcrumb-item>
            {{router.currentRoute.value.meta.name}}
          </el-breadcrumb-item>
        </el-breadcrumb>
      </div>
      <div class="manager-header-right">
        <el-dropdown>
          <div style="padding-right: 20px; display: flex; align-items: center ">
            <img style="width: 40px; height: 40px; border-radius: 50% ; display: block" src="@/assets/imgs/avatar.png">
            <span style="margin-left:5px ; color: white">管理员</span>
          </div>
          <template #dropdown>
            <el-dropdown-menu>
              <el-dropdown-item>个人资料</el-dropdown-item>
              <el-dropdown-item>修改密码</el-dropdown-item>
              <el-dropdown-item>退出登录</el-dropdown-item>
            </el-dropdown-menu>
          </template>
        </el-dropdown>
      </div>
    </div>


    <div style="display: flex">
      <div class="manager-main-left">
        <el-menu  :default-active="router.currentRoute.value.path"
                  :default-openeds="['1','2']"
                  router
        >
          <el-menu-item index="0">
            <el-icon><homeFilled /></el-icon>
            <span>系统首页</span>
          </el-menu-item>
          <el-sub-menu index="1">
            <template #title>
              <el-icon><Menu /></el-icon>
              <span>信息管理</span>
            </template>
            <el-menu-item index="/manager/go">go信息</el-menu-item>
          </el-sub-menu>
          <el-sub-menu index="2">
            <template #title>
              <el-icon><Menu /></el-icon>
              <span>用户管理</span>
            </template>
            <el-menu-item index="/manager/admin">管理员信息</el-menu-item>
          </el-sub-menu>
        </el-menu>
      </div>
      <div class="manager-main-right">
        <RouterView />
      </div>
    </div>
  </div>
</template>


<style scoped>
@import "@/assets/css/manager.css";
</style>
<script setup>
import router from "@/router/index.js";
</script>