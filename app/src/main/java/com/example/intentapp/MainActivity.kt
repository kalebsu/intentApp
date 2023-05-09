package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivityWithData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivityWithData.setOnClickListener(this)

        val btnMoveActivityWithObject: Button = findViewById(R.id.btn_move_activity_with_object)
        btnMoveActivityWithObject.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this,MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val moveIntentWithData = Intent(this,MoveActivityWithData::class.java)
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_NAME, "Ksuy")
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_CLASS, "TI.21.B.2")
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_AGE, "24")
                startActivity(moveIntentWithData)
            }

            R.id.btn_move_activity_with_object -> {
                val objectmhs = Mahasiswa (
                    "Kaleb Suy",
                    "TI.21.B.2",
                    24,
                    "khzputrafsr@gmail.com",
                    "Cikarang Selatan"
                        )

                val movewithObject = Intent(this, MoveActivityWithObject::class.java)
                movewithObject.putExtra(MoveActivityWithObject.EXTRA_MAHASISWA,objectmhs)
                startActivity(movewithObject)
            }
        }
    }
}