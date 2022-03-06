package com.zenlaeth.sirioitalia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ShipToActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ship_to)

        var nextB = findViewById<Button>(R.id.nextBShipTo)
        nextB.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, PaymentActivity::class.java)
            this.startActivity(intent);
        }
    }
}