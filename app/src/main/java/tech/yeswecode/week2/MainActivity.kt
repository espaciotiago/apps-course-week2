package tech.yeswecode.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            doLogin()
        }
    }

    private fun doLogin() {
        val email = loginEmailET.text.toString()
        val intent = Intent(this, SecondActivity::class.java)
        intent.apply {
            putExtra("EMAIL",email)
        }
        startActivity(intent)
    }
}