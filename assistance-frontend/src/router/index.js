import {createRouter, createWebHashHistory} from 'vue-router'

const routes = [
    {
        path: "/",
        component: () => import('../views/QueryPage.vue')
    }, {
        path: '/detail',
        name: "detail",
        component: () => import("../views/detail.vue")
    },

    {
        path: "/home",
        redirect: 'home',
        component: () => import('../views/layout.vue'),
        children: [
            {
                path: 'home',
                name: 'home',
                component: () => import('../views/QueryPage.vue')
            },
        ]
    }
]

const router = createRouter({
    history: createWebHashHistory(),
    routes
})

export default router
