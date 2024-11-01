package com.example.carritobluethoot

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    private val btnBuscarDispositivo = findViewById<View>(R.id.btnBuscarDispositivo) as Button
    private val bAdapter: BluetoothAdapter? = null
    private val arrayDevices: ArrayList<BluetoothDevice>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
    }


}