package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_seventeen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P16Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P17Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_sixteen.M6P16Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P17 : Fragment() {

    private lateinit var binding: FragmentM6P17Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P17Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener{
            navigateToDestination(M6P17Directions.openM6P18())
        }
//        binding.includeBottomButtons.ib_home.setOnClickListener {
//            val intent = Intent(this.context, MainActivity::class.java)
//            startActivity(intent)
//        }
        return binding.root
    }


}