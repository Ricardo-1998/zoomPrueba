package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_twenty_five

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P25Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_twenty_five.M6P25Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P25 : Fragment() {

    private lateinit var binding: FragmentM6P25Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P25Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener{
            navigateToDestination(M6P25Directions.openM6P26())
        }
//        binding.includeBottomButtons.ib_home.setOnClickListener {
//            val intent = Intent(this.context, MainActivity::class.java)
//            startActivity(intent)
//        }
        return binding.root
    }


}