package com.example.rpgdice

import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import android.view.MenuItem
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.widget.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        seekBar?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) { }

            override fun onStartTrackingTouch(p0: SeekBar?) { }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(this@MainActivity,
                    "Will roll dice " + (seekBar.progress + 1) + " times.",
                    Toast.LENGTH_SHORT).show()
            }
        })

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )



        val d4: Button = findViewById(R.id.d4)
        d4.setOnClickListener {
            val resultText: TextView = findViewById(R.id.result_text)
            val arr = Array<Int>(6, {0})
            var sum = 0
            var allVal = " "
            val type = "d4"
            for (x in 0 until (seekBar.progress + 1)) {
                val value = rollD4()
                sum += value
                arr[x] = value
                allVal += value.toString() + " "
            }

            resultText.text = type + "\nSum of Rolls = " + sum.toString() +
                    "\nSingle Rolls =\n" + allVal
        }

        val d6: Button = findViewById(R.id.d6)
        d6.setOnClickListener {
            val resultText: TextView = findViewById(R.id.result_text)
            val arr = Array<Int>(6, {0})
            var sum = 0
            var allVal = " "
            val type = "d6"
            for (x in 0 until (seekBar.progress + 1)) {
                val value = rollD6()
                sum += value
                arr[x] = value
                allVal += value.toString() + " "
            }

            resultText.text = type + "\nSum of Rolls = " + sum.toString() +
                    "\nSingle Rolls =\n" + allVal
        }

        val d8: Button = findViewById(R.id.D8)
        d8.setOnClickListener {
            val resultText: TextView = findViewById(R.id.result_text)
            val arr = Array<Int>(6, {0})
            var sum = 0
            var allVal = " "
            val type = "d8"
            for (x in 0 until (seekBar.progress + 1)) {
                val value = rollD8()
                sum += value
                arr[x] = value
                allVal += value.toString() + " "
            }

            resultText.text = type + "\nSum of Rolls = " + sum.toString() +
                    "\nSingle Rolls =\n" + allVal
        }

        val d10: Button = findViewById(R.id.d10)
        d10.setOnClickListener {
            val resultText: TextView = findViewById(R.id.result_text)
            val arr = Array<Int>(6, {0})
            var sum = 0
            var allVal = " "
            val type = "d10"
            for (x in 0 until (seekBar.progress + 1)) {
                val value = rollD10()
                sum += value
                arr[x] = value
                allVal += value.toString() + " "
            }

            resultText.text = type + "\nSum of Rolls = " + sum.toString() +
                    "\nSingle Rolls =\n" + allVal
        }

        val d12: Button = findViewById(R.id.d12)
        d12.setOnClickListener {
            val resultText: TextView = findViewById(R.id.result_text)
            val arr = Array<Int>(6, {0})
            var sum = 0
            var allVal = " "
            val type = "d12"
            for (x in 0 until (seekBar.progress + 1)) {
                val value = rollD12()
                sum += value
                arr[x] = value
                allVal += value.toString() + " "
            }

            resultText.text = type + "\nSum of Rolls = " + sum.toString() +
                    "\nSingle Rolls =\n" + allVal
        }

        val d20: Button = findViewById(R.id.d20)
        d20.setOnClickListener {
            val resultText: TextView = findViewById(R.id.result_text)
            val arr = Array<Int>(6, {0})
            var sum = 0
            var allVal = " "
            val type = "d20"
            for (x in 0 until (seekBar.progress + 1)) {
                val value = rollD20()
                sum += value
                arr[x] = value
                allVal += value.toString() + " "
            }

            resultText.text = type + "\nSum of Rolls = " + sum.toString() +
                    "\nSingle Rolls =\n" + allVal
        }

        val d100: Button = findViewById(R.id.d100)
        d100.setOnClickListener {
            val resultText: TextView = findViewById(R.id.result_text)
            val arr = Array<Int>(6, {0})
            var sum = 0
            var allVal = " "
            val type = "d100";
            for (x in 0 until (seekBar.progress + 1)) {
                val value = rollD100()
                sum += value
                arr[x] = value
                allVal += value.toString() + " "
            }

            resultText.text = type + "\nSum of Rolls = " + sum.toString() +
                    "\nSingle Rolls =\n" + allVal
        }


        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
    }

    private fun rollD4(): Int {
        val randomInt = Random().nextInt(4) + 1

        return randomInt
    }

    private fun rollD6(): Int {
        val randomInt = Random().nextInt(6) + 1

        return randomInt
    }

    private fun rollD8(): Int {
        val randomInt = Random().nextInt(8) + 1

        return randomInt
    }

    private fun rollD10(): Int {
        val randomInt = Random().nextInt(10) + 1

        return randomInt
    }

    private fun rollD12(): Int {
        val randomInt = Random().nextInt(12) + 1

        return randomInt
    }

    private fun rollD20(): Int {
        val randomInt = Random().nextInt(20) + 1

        return randomInt
    }

    private fun rollD100(): Int {
        val randomInt = Random().nextInt(100) + 1

        return randomInt
    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.aboutButton -> {
                msgAbout()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {

            R.id.nav_about -> {
                msgAbout()
            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun msgAbout() {
        val msg = "Created by Zachary Zampa during the summer of 2019"
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
}
