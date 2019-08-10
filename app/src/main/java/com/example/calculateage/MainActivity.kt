package com.example.calculateage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {

            //deklarasi edit text
            var tahunLahir = etInputUmur.text.toString()

            //get tahun ini dengan calender
            var tahun:Int = Calendar.getInstance().get(Calendar.YEAR)

            //set umur = tahun saat ini dikurangi dengan input pada text
            var umur = 0
            if (tahunLahir.toIntOrNull() !=null) {
                umur = tahun - tahunLahir.toInt()
                tvUmur.text = "Umur Anda = $umur Tahun"
            }else {
                tvUmur.text = "Tahun Tidak Valid"
            }
        }
    }
}

