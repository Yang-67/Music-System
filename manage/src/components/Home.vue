<template>
  <div>
    <the-header></the-header>
    <the-asider></the-asider>
    <div class="content-box" :class="{ 'content-collapse': collapse }">
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
import TheHeader from './TheHeader.vue'
import TheAsider from './TheAside.vue'
import bus from '../assets/js/bus'
export default {
  components: {
    TheHeader,
    TheAsider,
  },
  data() {
    return {
      collapse: false,
    }
  },
  created() {
    //通过Bus进行组件间的通信，来折叠侧边栏
    bus.$on('collapse', (msg) => {
      this.collapse = msg
    })
  },
}
</script>
