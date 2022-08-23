package co.fanavari.sepehrmahya

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import co.fanavari.sepehrmahya.databinding.FragmentSabteagahiBinding
import kotlinx.android.synthetic.main.fragment_sabteagahi.*
import java.util.*

class SabteagahiFragment : Fragment(R.layout.fragment_sabteagahi) {
    lateinit var list: ListView
    lateinit var listt: ArrayList<String>
    lateinit var seach: SearchView
    lateinit var listAdapter: ArrayAdapter<String>
    override fun onResume() {
        super.onResume()

        val list=view?.findViewById<ListView>(R.id.listview)
        val seach=view?.findViewById<androidx.appcompat.widget.SearchView>(R.id.searchview)

        listt = ArrayList()
        listt.add("املاک")
        listt.add("وسایل نقلیه")
        listt.add("کالای دیجیتال")
        listt.add("خانه وآشپزخانه")
        listt.add("خدمات")
        listt.add("وسایل شخصی")
        listt.add("سرگرمی")
        listt.add("اجتماعی")
        listt.add("ابزارو صنعتی")
        listt.add("کاریابی")
        listAdapter = ArrayAdapter(
          this.requireContext(),
            android.R.layout.simple_list_item_1,)
            listt

        list?.adapter = listAdapter
        seach?.setOnQueryTextListener(object :androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (listt.contains(query)) {
                    listAdapter.filter.filter(query)
                } else {
                    Toast.makeText(context,"nothing found", Toast.LENGTH_SHORT).show()
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                listAdapter.filter.filter(newText)
                return false
            }

        })

    }
private lateinit var binding: FragmentSabteagahiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=FragmentSabteagahiBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

    }
}