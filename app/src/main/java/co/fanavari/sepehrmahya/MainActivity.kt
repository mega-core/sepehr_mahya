package co.fanavari.sepehrmahya

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_mashop.view.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mahya1 = MashopFragment()
        val mahya2 = ChatFragment()
        val mahya3 = SabteagahiFragment()
        val mahya4 = DasstehaFragment()
        val mahya5 = AgahiFragment()
bottomnav.getOrCreateBadge(R.id.chat).apply {
    number =10
    isVisible = true

}

        bottomnav.selectedItemId = R.id.shop
        bottomnav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.profile -> sepehr(mahya1)
                R.id.chat -> sepehr(mahya2)
                R.id.Add -> sepehr(mahya3)
                R.id.category -> sepehr(mahya4)
                R.id.shop -> sepehr(mahya5)
            }
            true
        }


    }

    private fun sepehr(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framlayout, fragment)
            commit()
        }
    }
}