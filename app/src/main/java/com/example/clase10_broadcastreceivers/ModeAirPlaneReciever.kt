package com.example.clase10_broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ModeAirPlaneReciever: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isEnabled = intent?.
        getBooleanExtra("state", false) ?: return

        if(isEnabled) {
            Toast.makeText(context, "MODO AVION ACTIVADO", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "MODO AVION DESACTIVADO", Toast.LENGTH_LONG).show()
        }
    }
}
