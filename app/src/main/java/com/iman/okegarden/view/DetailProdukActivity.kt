package com.iman.okegarden.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iman.okegarden.R

class DetailProdukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_produk)
        supportActionBar?.hide()
    }
}