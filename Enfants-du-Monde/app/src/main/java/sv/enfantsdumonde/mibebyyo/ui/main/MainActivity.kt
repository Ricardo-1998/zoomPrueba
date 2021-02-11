package sv.enfantsdumonde.mibebyyo.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val host = supportFragmentManager.findFragmentById(R.id.main_nav_host_fragment) as NavHostFragment
        navController = host.navController
        setUpNavDrawer()
        setUpToolbar()
    }

    private fun setUpNavDrawer() {
        binding.mainNavView.setupWithNavController(navController)
    }

    private fun setUpToolbar() {
        val appBarConfig = AppBarConfiguration(navController.graph, binding.mainDrawerLayout)
        binding.mainToolbar.setupWithNavController(navController, appBarConfig)
        binding.mainToolbar.title = getString(R.string.text_me_and_my_baby)
    }





}