package co.fanavari.sepehrmahya

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import co.fanavari.sepehrmahya.databinding.FragmentMashopBinding
import kotlinx.android.synthetic.main.fragment_mashop.*

class MashopFragment : Fragment(R.layout.fragment_mashop) {
    private lateinit var binding:FragmentMashopBinding
    override fun onResume() {
        super.onResume()


 textsignin.setOnClickListener {
     val intent =Intent(context,SigninActivity::class.java)
     startActivity(intent)

 }

    }

}