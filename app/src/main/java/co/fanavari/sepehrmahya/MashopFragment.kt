package co.fanavari.sepehrmahya

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signin.*
import kotlinx.android.synthetic.main.fragment_mashop.*
import kotlinx.android.synthetic.main.fragment_mashop.view.*

class MashopFragment : Fragment(R.layout.fragment_mashop) {
    override fun onResume() {

        super.onResume()

 textsignin.setOnClickListener {
     val intent =Intent(context,CryAcivity::class.java)
     startActivity(intent)

 }

    }

}