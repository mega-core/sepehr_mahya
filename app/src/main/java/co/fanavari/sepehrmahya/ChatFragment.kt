package co.fanavari.sepehrmahya

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_chat.*

class ChatFragment : Fragment(R.layout.fragment_chat) {
       override fun onResume() {
        super.onResume()
textstartchating.setOnClickListener {
    val intent=Intent(context,StartChatingActivity::class.java)
    startActivity(intent)
}

    }

}