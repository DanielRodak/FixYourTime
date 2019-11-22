package com.rodak.mvi.navigation

import android.content.Context
import android.content.Intent

class Navigation(private val context: Context) : NavigationController {
    override fun startActivityWithUsername(username: String, clazz: Class<*>) {
        val intent = Intent(context, clazz)
        intent.putExtra("xdd", username)
        context.startActivity(intent)
    }
    override fun startActivity(clazz: Class<*>) {
        val intent = Intent(context, clazz)
        context.startActivity(intent)
    }
}