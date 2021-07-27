package com.example.mycheckbox


import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.button) as Button
        button.setOnClickListener{
            Toast.makeText(this,"An item was added",Toast.LENGTH_SHORT).show()
        }

        val button2 = findViewById(R.id.button2) as Button
        button2.setOnClickListener{
            Toast.makeText(this,"An item was removed",Toast.LENGTH_SHORT).show()
        }
        val editText = findViewById<EditText>(R.id.editText);
        val msg = editText.text.toString()

    }

    // multiple checkbox click method
    fun onCheckboxClicked(view: View) {
        var checked = view as CheckBox
        if (itly == checked) {
            message(itly.text.toString() + if (itly.isChecked) " Checked " else " UnChecked ")
        }
        if (rome == checked) {
            message(rome.text.toString() + if (rome.isChecked) " Checked " else " UnChecked ")
        }

        if (varanasi == checked) {
            message(varanasi.text.toString() + if (varanasi.isChecked) " Checked " else " UnChecked ")
        }
        if (moscow == checked) {
            message(moscow.text.toString() + if (moscow.isChecked) " Checked " else " UnChecked ")
        }
    }

    fun message(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }
}