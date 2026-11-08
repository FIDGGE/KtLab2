package com.example.ktlab2

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    Timber.plant(Timber.DebugTree())

    val buttonOk = findViewById<Button>(R.id.button_ok)
    buttonOk.setOnClickListener {
      Toast.makeText(this, "Кнопка ОК", Toast.LENGTH_SHORT).show()
    }

    val editText = findViewById<EditText>(R.id.edit_text)

    val buttonLog = findViewById<Button>(R.id.button_log)
    buttonLog.setOnClickListener {
      Log.v("From EditText", editText.text.toString())
    }

    val buttonTimber = findViewById<Button>(R.id.button_timber)
    buttonTimber.setOnClickListener {
      Timber.v(editText.text.toString())
    }

    val buttonBlackText = findViewById<Button>(R.id.button_black_text)
    buttonBlackText.setOnClickListener {
      editText.setTextColor(Color.BLACK)
    }

    val buttonRedText = findViewById<Button>(R.id.button_red_text)
    buttonRedText.setOnClickListener {
      editText.setTextColor(Color.RED)
    }

    val buttonSize8sp = findViewById<Button>(R.id.button_size_8sp)
    buttonSize8sp.setOnClickListener {
      editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8f)
    }

    val buttonSize24sp = findViewById<Button>(R.id.button_size_24sp)
    buttonSize24sp.setOnClickListener {
      editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
    }

    val buttonWhiteBg = findViewById<Button>(R.id.button_white_bg)
    buttonWhiteBg.setOnClickListener {
      editText.setBackgroundColor(Color.WHITE)
    }

    val buttonYellowBg = findViewById<Button>(R.id.button_yellow_bg)
    buttonYellowBg.setOnClickListener {
      editText.setBackgroundColor(Color.YELLOW)
    }
  }
}
