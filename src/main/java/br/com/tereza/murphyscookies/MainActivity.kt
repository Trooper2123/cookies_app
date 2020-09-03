package br.com.tereza.murphyscookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        goButton.setOnClickListener {
            val mIntent = Intent(this, CookieActivity::class.java)
            startActivity(mIntent)
        }
    }
}