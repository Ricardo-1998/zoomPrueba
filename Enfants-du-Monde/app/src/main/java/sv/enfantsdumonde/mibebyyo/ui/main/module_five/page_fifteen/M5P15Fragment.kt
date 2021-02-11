package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_fifteen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P12Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P15Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_fifteen.M5P15FragmentDirections
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M5P15Fragment : Fragment() {

    private lateinit var binding: FragmentM5P15Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM5P15Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M5P15FragmentDirections.openM5P16())
        }
        return binding.root
    }

}