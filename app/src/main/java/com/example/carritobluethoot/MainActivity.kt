package com.example.carritobluethoot

import android.R.attr.action
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

//    private var btnBuscarDispositivo = findViewById<View>(R.id.btnBuscarDispositivo) as Button
//    private var bAdapter: BluetoothAdapter? = null
//    private var arrayDevices: ArrayList<BluetoothDevice>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val bluetoothManager: BluetoothManager = getSystemService(BluetoothManager::class.java)
        val bluetoothAdapter: BluetoothAdapter? = bluetoothManager.getAdapter()
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