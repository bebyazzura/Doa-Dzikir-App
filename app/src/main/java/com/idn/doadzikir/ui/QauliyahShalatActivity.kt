package com.idn.doadzikir.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.idn.doadzikir.R
import com.idn.doadzikir.adapter.DzikirDoaAdapter
import com.idn.doadzikir.model.DataDzikirDoa

class QauliyahShalatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_qauliyah_shalat)
        val rvQauliyah: RecyclerView= findViewById(R.id.rv_qauliyah_shalat)
        rvQauliyah.layoutManager = LinearLayoutManager(this)

        rvQauliyah.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}