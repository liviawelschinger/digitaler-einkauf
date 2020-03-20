<template web>
  <div class="w-page">
    <div class="w-container">
    </div>
  </div>
</template>
<template native>
  <Page>
    <ActionBar :title="navbarTitle"/>
    <GridLayout rows="auto, auto">
      <!-- copy-webpack-plugin copies asset from src/assets to project output/build directory /assets -->
    </GridLayout>
  </Page>
</template>
<script>
  export default {
    name: 'home',
    components: {},
    data() {
      return {
      };
    }
  };

</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
