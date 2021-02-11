package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_twelve

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
 import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P12Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_twelve.M7P12
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P12 : Fragment() {

    private lateinit var binding: FragmentM7P12Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM7P12Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P12Directions.openM7P13())
        }

        return binding.root
    }

     
}