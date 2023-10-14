package com.putragandad.recycleviewstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView

    private lateinit var tpsList : ArrayList<TPSTerdekat>

    private lateinit var tpsAdapter : TPSTerdekatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        tpsList = ArrayList()

        tpsList.add(TPSTerdekat(R.drawable.image_tps3r, "TPS 3R Kalidoni", "1.5 km", "Jalan Taqwa", "TPS 3R" ))
        tpsList.add(TPSTerdekat(R.drawable.image_tps3r, "TPS Sukawinatan", "3.5 km", "Jalan Mayor Zen", "TPS Terpadu"))
        tpsList.add(TPSTerdekat(R.drawable.image_tps3r, "Bank Sampah Sekojo", "2.5 km", "Jalan Mayor Zen", "Bank Sampah"))

        tpsAdapter = TPSTerdekatAdapter(tpsList)
        recyclerView.adapter = tpsAdapter

    }
}