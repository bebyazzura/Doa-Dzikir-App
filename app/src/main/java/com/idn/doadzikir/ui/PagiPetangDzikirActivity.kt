package com.idn.doadzikir.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import com.idn.doadzikir.R
import com.idn.doadzikir.ui.detail.DzikirPagiActivity
import com.idn.doadzikir.ui.detail.DzikirPetangActivity

class PagiPetangDzikirActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_pagi_petang_dzikir)

        val cvDzikirPagi: CardView = findViewById(R.id.cv_dzikir_pagi)
        cvDzikirPagi.setOnClickListener {
            startActivity(Intent(this, DzikirPagiActivity::class.java))
        }
        val btnDzikirPagi: ImageButton = findViewById(R.id.img_btn_dzikir_pagi)
        btnDzikirPagi.setOnClickListener {
            startActivity(Intent(this, DzikirPagiActivity::class.java))
        }

        val cvDzikirPetang: CardView = findViewById(R.id.cv_dzikir_petang)
        cvDzikirPetang.setOnClickListener {
            startActivity(Intent(this, DzikirPetangActivity::class.java))
        }
        val btnDzikirPetang: ImageButton = findViewById(R.id.img_btn_dzikir_petang)
        btnDzikirPetang.setOnClickListener {
            startActivity(Intent(this, DzikirPetangActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}