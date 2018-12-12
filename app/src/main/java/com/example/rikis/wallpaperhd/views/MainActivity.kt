package com.example.rikis.wallpaperhd.views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.rikis.wallpaperhd.R
import com.example.rikis.wallpaperhd.R.id.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                category -> {
                    loadCategory(savedInstanceState)
                }
                favorite -> {
                    loadFavorites(savedInstanceState)
                }
                about -> {
                    loadAbout(savedInstanceState)
                }
            }
            true
        }
        bottom_navigation.selectedItemId = category

    }

    private fun loadCategory(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            val mFragCategory = FragCategory()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container, mFragCategory, mFragCategory::class.java.simpleName)
                .commit()
        }
    }

    private fun loadFavorites(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            val mFragFavorites = FragFavorites()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container, mFragFavorites, mFragFavorites::class.java.simpleName)
                .commit()
        }
    }

    private fun loadAbout(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            val mFragAbout = FragAbout()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container, mFragAbout, mFragAbout::class.java.simpleName)
                .commit()
        }
    }
}
