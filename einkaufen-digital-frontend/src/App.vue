<template web>
  <div class="w-page">
    <Welcome></Welcome>
  </div>
</template>
<template native>
  <Page>
    <Welcome></Welcome>
  </Page>
</template>
<script>
  import Welcome from './views/Welcome';
  const { VUE_APP_MODE, VUE_APP_PLATFORM } = process.env;
  
  export default {
    components: {
      Welcome
    },
    data() {
      return {
        navbarTitle: `Digital Einkaufen`,
        msg: `Mode=${VUE_APP_MODE} and Platform=${VUE_APP_PLATFORM}`,
      };
    },
    methods: {
    }
  };
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
