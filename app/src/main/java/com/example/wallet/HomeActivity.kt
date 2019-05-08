package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.WindowManager
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private lateinit var toolbar: Toolbar
    private lateinit var  drawerLayout: DrawerLayout
    private lateinit var  navController: NavController
    private lateinit var  navigationView:NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//        getWindow().setFlags(
//            WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
//            WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);
//
//
//        setupNavigation()
//
//    }
//
//    // Setting Up One Time Navigation
//    private fun setupNavigation() {
//
//            toolbar = findViewById(R.id.toolbar)
//            setSupportActionBar(toolbar)
//            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//            supportActionBar!!.setDisplayShowHomeEnabled(true)
//            drawerLayout = findViewById(R.id.drawer_layout)
//            navigationView = findViewById(R.id.navigationView)
//            navController = Navigation.findNavController(this, R.id.defaultFragment)
//        Handler().postDelayed({
//            NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
//            NavigationUI.setupWithNavController(navigationView, navController)
//            navigationView.setNavigationItemSelectedListener(this)
//
//        }, 200)
//
//
//
//
//
//
//    }
//
//    public override fun onSupportNavigateUp():Boolean {
//        return NavigationUI.navigateUp(drawerLayout, Navigation.findNavController(this, R.id.defaultFragment))
//
//    }
//
//    @Override
//    public override fun onBackPressed() {
//            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
//                drawerLayout.closeDrawer(GravityCompat.START)
//            } else {
//                Handler().postDelayed({
//                  //  super.onBackPressed()
//                    drawerLayout.openDrawer(GravityCompat.START)
//
//                }, 200)
//
//            }
//
//
//
//    }
//
//
//   override fun onNavigationItemSelected(menuItem:MenuItem):Boolean {
//       Handler().postDelayed({
//           menuItem.isChecked = true
//           drawerLayout.closeDrawers()
//           drawerLayout.closeDrawer(GravityCompat.START)
//           var id :Int= menuItem.itemId
//
//           when (id) {
//               R.id.nav_dashboard -> navController.navigate(R.id.firstDashboardFragment)
//               R.id.nav_transfer -> navController.navigate(R.id.secondTransferFragment)
//               R.id.nav_reports -> navController.navigate(R.id.thirdReportsFragment)
//               R.id.nav_logout -> {
//                   startActivity(Intent(this@HomeActivity, LoginActivity::class.java))
//                   finish()
//
//               }
//           }
//       }, 200)
//
//
//
//        return true

    }

}