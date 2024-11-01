package com.example.carritobluethoot

import android.R.attr.action
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

//    private var btnBuscarDispositivo = findViewById<View>(R.id.btnBuscarDispositivo) as Button
//    private var bAdapter: BluetoothAdapter? = null
//    private var arrayDevices: ArrayList<BluetoothDevice>? = null


    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val bluetoothManager: BluetoothManager = getSystemService(BluetoothManager::class.java)
        val bluetoothAdapter: BluetoothAdapter? = bluetoothManager.getAdapter()

        if (bluetoothAdapter?.isEnabled == false) {
            val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            val REQUEST_ENABLE_BT = 1
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT)
        }

        //consultar el conjunto de para ver si el dispositivo deseado ya es conocido por si direccion MAC
        val pairedDevices: Set<BluetoothDevice>? = bluetoothAdapter?.bondedDevices
        pairedDevices?.forEach { device ->
            val deviceName = device.name
            val deviceHardwareAddress = device.address // MAC address
        }

        // regitro para broadcasts cuando un dispositivo es descubierto
        val filter = IntentFilter(BluetoothDevice.ACTION_FOUND)
        registerReceiver(receiver, filter)

        //CODIGO PARA HACER EL DISPOSITIVO ANDROID DESCUBRIBLE POR 5 MINUTOS
//        val requestCode = 1;
//        val discoverableIntent: Intent = Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE).apply {
//            putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300)
//        }
//        startActivityForResult(discoverableIntent, requestCode)

        

        //=====BOTONES=====
        val btnBuscar : Button = findViewById(R.id.btnBuscarDispositivo)
        btnBuscar.setOnClickListener { view ->

        }
        val btnAdelante : Button = findViewById(R.id.btnAdelante)
        btnAdelante.setOnClickListener{view->
            //codigo cuando el boton es clickeado
        }
        val btnAtras : Button = findViewById(R.id.btnAtras)
        btnAtras.setOnClickListener{view->
            //codigo cuando el boton es clickeado
        }
        val btnIzquierda : Button = findViewById(R.id.btnIzquierda)
        btnIzquierda.setOnClickListener{view->
            //codigo cuando el boton es clickeado
        }
        val btnDerecha : Button = findViewById(R.id.btnDerecha)
        btnDerecha.setOnClickListener{view->
            //codigo cuando el boton es clickeado
        }
    }

    // Create a BroadcastReceiver for ACTION_FOUND.
    private val receiver = object : BroadcastReceiver() {

        @SuppressLint("MissingPermission")
        override fun onReceive(context: Context, intent: Intent) {
            val action: String? = intent.action
            when(action) {
                BluetoothDevice.ACTION_FOUND -> {
                    // Discovery has found a device. Get the BluetoothDevice
                    // object and its info from the Intent.
                    val device: BluetoothDevice? =
                        intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE)
                    if (device != null) {
                        val deviceName = device.name //nombre del dispositivo
                        val deviceHardwareAddress = device.address // direccion MAC
                    }
                }
            }
        }
    }

    //Al cerrar la aplicacion
    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(receiver)
    }












    // Instanciamos un BroadcastReceiver que se encargara de detectar cuando
    // un dispositivo es descubierto.
//    private val bReceiver: BroadcastReceiver = object : BroadcastReceiver() {
//        override fun onReceive(context: Context, intent: Intent) {
//            // Cada vez que se descubra un nuevo dispositivo por Bluetooth, se ejecutara
//            // este fragmento de codigo
//            if (BluetoothDevice.ACTION_FOUND.equals(action)) {
//                // Acciones a realizar al descubrir un nuevo dispositivo
//                // Si el array no ha sido aun inicializado, lo instanciamos
//                if (arrayDevices == null)
//                    arrayDevices = ArrayList<BluetoothDevice>()
//
//                // Extraemos el dispositivo del intent mediante la clave BluetoothDevice.EXTRA_DEVICE
//                val dispositivo: BluetoothDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE)!!
//
//                // Añadimos el dispositivo al array
//                arrayDevices!!.add(dispositivo)
//
//                // Le asignamos un nombre del estilo NombreDispositivo [00:11:22:33:44]
//                val descripcionDispositivo = dispositivo.name + " [" + dispositivo.address + "]"
//
//                // Mostramos que hemos encontrado el dispositivo por el Toast
//                Toast.makeText(
//                    baseContext,
//                    getString(R.string.DetectadoDispositivo) + ": " + descripcionDispositivo,
//                    Toast.LENGTH_SHORT
//                ).show()
//            } else if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED.equals(action)) {
//                // Acciones a realizar al finalizar el proceso de descubrimiento
//            }
//        }
//    }
}