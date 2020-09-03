package br.com.tereza.murphyscookies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BeyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bey)
        supportActionBar?.hide()

    }
}