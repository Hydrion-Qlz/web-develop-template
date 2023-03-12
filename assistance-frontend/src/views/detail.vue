<template>
  <div>
    <div>{{ $route.query.url }}</div>
    <div>{{ $route.query.color }}</div>
    <div>{{ $route.query.category }}</div>
  </div>
</template>

<script>
export default {
  name: "detail",
  methods: {
    async getSimilarWebInfo() {
      const result = await this.$get("/similarWeb/getSimilarWebInfo", {
        url: this.$route.query.url,
        color: this.$route.query.color,
        category: this.$route.query.category,
      })
      console.log(result)
    }
  },
  async created() {
    await this.getSimilarWebInfo()
  }
}
</script>

<style scoped>

</style>