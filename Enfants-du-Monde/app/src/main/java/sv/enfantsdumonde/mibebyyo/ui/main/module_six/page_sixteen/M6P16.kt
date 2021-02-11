package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_sixteen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P8Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P16Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P16Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_eight.M1P8FragmentDirections
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P16 : Fragment() {

    private lateinit var binding: FragmentM6P16Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P16Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener{
            navigateToDestination(M6P16Directions.openM6P17())
        }
//        binding.includeBottomButtons.ib_home.setOnClickListener {
//            val intent = Intent(this.context, MainActivity::class.java)
//            startActivity(intent)
//        }
        return binding.root
    }


}