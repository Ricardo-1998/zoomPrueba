package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_twenty_four

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P24Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_twenty_four.M6P24Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P24 : Fragment() {

    private lateinit var binding: FragmentM6P24Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P24Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener{
           navigateToDestination(M6P24Directions.openM6P25())
        }
//        binding.includeBottomButtons.ib_home.setOnClickListener {
//            val intent = Intent(this.context, MainActivity::class.java)
//            startActivity(intent)
//        }
        return binding.root
    }


}