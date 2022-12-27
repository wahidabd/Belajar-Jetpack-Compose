package com.wahidabd.dicodingcompose.navigation

sealed class Routes(val route: String){

    object Main : Routes("main")
    object Home : Routes("home")
    object Search : Routes("search")
    object Profile : Routes("profile")
    object Detail : Routes("detail/{id}"){
        fun createRoute(id: Int) = "detail/$id"
    }

}