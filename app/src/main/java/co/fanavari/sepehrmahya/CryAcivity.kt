package co.fanavari.sepehrmahya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cry_acivity.*

class CryAcivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cry_acivity)
        buttonmhya.setOnClickListener {
            if (textname.text.toString()==""&&textnumber.text.toString()=="")
            {
                layout1.error = "نام خود را وارد کنید"
                layout2.error ="شمارتو وارد کن عقب مونده"
            }
            else
            {
                layout1.error = null
                layout2.error = null
            }
        }
    }
}