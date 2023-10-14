package com.putragandad.recycleviewstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailTPSActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tpsactivity)

        val tps = intent.getParcelableExtra<TPSTerdekat>("tps")
        if (tps != null) {
            val imageTPS : ImageView = findViewById(R.id.iv_detail_tps)
            val namaTPS : TextView = findViewById(R.id.tv_detail_nama)
            val jenisTPS : TextView = findViewById(R.id.tv_detail_jenis)
            val alamatTPS : TextView = findViewById(R.id.tv_detail_alamat)
            val jarakTPS : TextView = findViewById(R.id.tv_detail_jarak)

            namaTPS.text = tps.namaTPS
            imageTPS.setImageResource(tps.image)
            jenisTPS.text = tps.jenisTPS
            alamatTPS.text = tps.alamatTPS
            jarakTPS.text = tps.jarakTPS
        }
    }
}