package com.example.dinaajobsheet14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pplg = findViewById<Button>(R.id.fragmentPPLG)
        val busana = findViewById<Button>(R.id.fragmentBusana)
        val tpfl = findViewById<Button>(R.id.fragmentTPFL)
        val to = findViewById<Button>(R.id.fragmentTO)
        val kuliner = findViewById<Button>(R.id.fragmentKuliner)

        pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, pplg())
            fragmentTransaction.commit()
        }

        busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, busana())
            fragmentTransaction.commit()
        }

        tpfl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, tpfl())
            fragmentTransaction.commit()
        }

        to.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, to())
            fragmentTransaction.commit()
        }

        kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, kuliner())
            fragmentTransaction.commit()
        }


    }
}