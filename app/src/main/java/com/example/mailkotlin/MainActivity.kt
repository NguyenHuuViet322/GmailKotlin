package com.example.mailkotlin

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBar
import com.example.mailkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val mail = arrayOf(
            Mail("toidihoc",
                "These act like normal Command Cards but have extremely powerful effects such as area-of-effect damage, inflicting Status Effects, and healing, among others.",
                "12:23 PM",
                true),
            Mail("daunhotcastrol",
            "Once the NP gauge is at or over 100%, the Servant's NP gauge glows and, at the Command Card selection screen, the Noble Phantasm card appears above the normal Command Cards. When an NP is used, the Servant's NP gauge will drop to 0%",
            "2:34 AM",
            true),
            Mail("huuviet10a4",
            "Notice that, for Rank A, the base effect does not change between a 100% and 200% NP gauge, it only changes when comparing with Rank A++. Likewise, the overcharge effect does not change between ranks, but it does when you look at a 100% vs. 200% NP gauge",
            "3:25 AM",
            true))
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar?.title = "      Inbox"
        actionBar?.setIcon(R.drawable.whitemenu)
        actionBar?.setDisplayUseLogoEnabled(true)
        actionBar?.setDisplayShowHomeEnabled(true)

        val myListAdapter = MailAdapter(this, mail)
        binding.mailView.adapter = myListAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }
}