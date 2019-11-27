package com.vikisoft.drawerdemo_1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.activity_main.bell_iv/**/
import kotlinx.android.synthetic.main.custom_toolbar.*

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout : DrawerLayout
    private lateinit var actionDrawerToogle: ActionBarDrawerToggle
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        navigationView = findViewById(R.id.nav_view)
        drawerLayout = findViewById(R.id.drawer_layout)
        actionDrawerToogle = ActionBarDrawerToggle(this, drawerLayout, R.string.Open, R.string.Close)


        drawerLayout.addDrawerListener(actionDrawerToogle)
        actionDrawerToogle.syncState()

//        nav_view.inflateMenu(R.layout.custom_toolbar)


        navigationView.setNavigationItemSelectedListener {
            Toast.makeText(this, "hello", Toast.LENGTH_LONG).show()
            true
        }

        nav_view.setOnClickListener {
            Toast.makeText(this, "hello", Toast.LENGTH_LONG).show()
        }
//        setSupportActionBar(my_toolbar)
        cool.setOnClickListener {
            Toast.makeText(this, "hello", Toast.LENGTH_LONG).show()
        }

        val actionBar = supportActionBar

        drawer_iv.setOnClickListener {
            drawerLayout.openDrawer(Gravity.LEFT)
        }
//        val view : View = LayoutInflater.from(this).inflate(R.layout.custom_toolbar, null, false);
//        actionBar!!.customView = view
//        my_toolbar.addView(view)

//        my_toolbar.menu.findItem(R.id.notification).

       /* bell_iv.setOnClickListener {
            Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show()
        }*/


//        drawerLayout.addView(view)
    }



/*
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu, menu)
        return true
    }*/



}
