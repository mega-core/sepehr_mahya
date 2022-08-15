package co.fanavari.sepehrmahya

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signin.*

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        instagram.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
     intent.data =Uri.parse("https://instagram.com/_bymahya_/")
            startActivity(intent)
        }
    }
}