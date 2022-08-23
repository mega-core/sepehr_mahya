package co.fanavari.sepehrmahya

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceDataStore
import android.widget.Toast
import co.fanavari.sepehrmahya.Constant.name
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        instagram.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://instagram.com/_bymahya_/")
            startActivity(intent)
        }
        buttonmhya.setOnClickListener {
            if (textname.text.toString() == "") {
                layout1.error = "اسم خود را وارد کنید "
                Handler().postDelayed(fun() { layout1.error = null },3000)
            }
            if (textnumber.text.toString() == "") {
                layout2.error = "شماره خود را وارد کنید"
                Handler().postDelayed(fun() { layout2.error = null }, 3000)
            }
            if (textname.text.toString() != "" && textnumber.text.toString() != "") {
                Toast.makeText(this, "چرا از من نمیخوای استفاده کنی", Toast.LENGTH_SHORT).show()
            }
        }

    }
}