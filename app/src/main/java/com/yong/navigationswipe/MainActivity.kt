package com.yong.navigationswipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController : LiveData<NavController>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) setUpBottomNavigationBar()
    }

    private fun setUpBottomNavigationBar() {
        val navGraphIds = listOf(R.navigation.home_graph , R.navigation.histroy_graph, R.navigation.setting_graph)
        val controller = bottom_nav.setupWithNavController(navGraphIds , supportFragmentManager , R.id.nav_host_fragment_container)

        controller.observe(this , Observer {
            setupActionBarWithNavController(it)
        })

        navController = controller
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.value?.navigateUp() ?: false
    }
}
