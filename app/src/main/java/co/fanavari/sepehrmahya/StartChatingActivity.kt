package co.fanavari.sepehrmahya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_start_chating.*

class StartChatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_chating)
val view =findViewById<LinearLayout>(R.id.linearLayoutId)
    floting.setOnClickListener {
        view.layoutParams.width=100
    }
    }
}