import {createApp, Vue} from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import 'ant-design-vue/dist/antd.css';
import Antd from 'ant-design-vue';
import axios from 'axios'

const app = createApp(App).use(store).use(router).use(Antd)

const instance = axios.create({
    baseURL: 'http://localhost:8080/api',
    timeout: 4000
})


app.config.globalProperties.$get = function (url, params = {}) {
    return instance.get(url, {params})
}

app.config.globalProperties.$post = function (url, data = {}) {
    return instance.post(url, data)
}


app.mount("#app")