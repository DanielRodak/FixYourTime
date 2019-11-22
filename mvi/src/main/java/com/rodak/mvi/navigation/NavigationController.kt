package com.rodak.mvi.navigation

interface NavigationController {

    fun startActivity(clazz: Class<*>)

    fun startActivityWithUsername(username: String, clazz: Class<*>)
}