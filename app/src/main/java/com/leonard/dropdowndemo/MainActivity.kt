package com.leonard.dropdowndemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.EditText
import com.leonard.dropdowndemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

	private lateinit var _binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		_binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(_binding.root)

		setOnClickListener()
	}

	private fun setOnClickListener() {
		val items = listOf("Cardiologist", "Dentist", "ENT specialist", "Obstetrician/Gynaecologist", "Orthopaedic surgeon","Psychiatrists", "Radiologist", "Pulmonologist", "Neurologist", "Allergists", "Gastroenterologists", "Urologists", "Otolaryngologists", "Rheumatologists", "Anesthesiologists")
		val adapter = ArrayAdapter(this, R.layout.list_items, items)
		_binding.menuDoctorTypeAuto.setAdapter(adapter)


		_binding.menuDoctorTypeAuto.setOnClickListener {
			_binding.menuDoctorTypeAuto.text.toString()
		}
	}
}