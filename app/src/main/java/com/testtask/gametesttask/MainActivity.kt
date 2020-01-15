package com.testtask.gametesttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavOptions
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        when (findNavController(R.id.my_nav_host_fragment).currentDestination!!.label!!.toString()) {
            MAIN_MENU_FRAGMENT -> finish()
            else -> super.onBackPressed()
        }
    }

    companion object {
        const val MAIN_MENU_FRAGMENT = "MainManuFragment"
    }
}
