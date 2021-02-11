package sv.enfantsdumonde.mibebyyo.ui.main.module_four.page_thirteen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM4P12Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM4P13Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_four.page_twelve.M4P12Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M4P13 : Fragment() {

    private lateinit var binding: FragmentM4P13Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM4P13Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M4P13Directions.openM4P14())
        }

        return binding.root
    }


}