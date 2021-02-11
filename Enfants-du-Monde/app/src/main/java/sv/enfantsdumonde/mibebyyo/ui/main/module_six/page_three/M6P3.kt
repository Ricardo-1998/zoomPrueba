package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_three

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P20Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P3Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_twenty.M6P20Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P3 : Fragment() {

    private lateinit var binding: FragmentM6P3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P3Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener{
            navigateToDestination(M6P3Directions.openM6P4())
        }
//        binding.includeBottomButtons.ib_home.setOnClickListener {
//            val intent = Intent(this.context, MainActivity::class.java)
//            startActivity(intent)
//        }
        return binding.root
    }


}