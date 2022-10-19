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


/*
		// Disease List
		////        val items = listOf("Not sure", "Fever", "Cold & Flu", "Diarrhea","Headache", "Allergies", "Stomach Aches","Conjunctivitis", "Dehydration", "Tooth ache", "Ear ache", "Food poisoning")
		val items: List<String> = mapOfDiseasesList[doctorType]!!
		val adapter = ArrayAdapter(this, R.layout.list_items, items)
		binding.diseaseDropdown.setAdapter(adapter)

		// Situation List
		val situationItems = listOf("Severe Pain", "Mild Pain", "No Pain")
		val situationAdapter = ArrayAdapter(this, R.layout.list_items, situationItems)
		binding.situationDropdown.setAdapter(situationAdapter)

		val timeItems = listOf("9:00 AM - 11:00 AM","11:00 AM - 13:00 PM", "17:00 PM - 19:00 PM","19:00 PM - 22:OO PM")
		val timeAdapter = ArrayAdapter(this, R.layout.list_items, timeItems)
		binding.timeDropdown.setAdapter(timeAdapter)*/
	}
}