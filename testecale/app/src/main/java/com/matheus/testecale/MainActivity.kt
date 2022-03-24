package com.matheus.testecale

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.snackbar.Snackbar
import com.matheus.testecale.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        val accelerometer: Sensor? = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

        val temperature: Sensor? = sensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION)

        val heart: Sensor? = sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR)

        val gyroscope: Sensor? = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE)

        val proximity: Sensor? = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY)




        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.button7.setOnClickListener() { mostra ->
            Snackbar.make(mostra, accelerometer.toString(), Snackbar.LENGTH_LONG)
               . setAction("Action", null).show()
            binding.textView16.setText(accelerometer.toString())
            Snackbar.make(mostra, temperature.toString(), Snackbar.LENGTH_LONG)
                . setAction("Action", null).show()
            binding.textView20.setText(temperature.toString())
            Snackbar.make(mostra, heart.toString(), Snackbar.LENGTH_LONG)
                . setAction("Action", null).show()
            binding.textView19.setText(heart.toString())
            Snackbar.make(mostra, gyroscope.toString(), Snackbar.LENGTH_LONG)
                . setAction("Action", null).show()
            binding.textView18.setText(gyroscope.toString())
            Snackbar.make(mostra, proximity.toString(), Snackbar.LENGTH_LONG)
                . setAction("Action", null).show()
            binding.textView17.setText(proximity.toString())
        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}




