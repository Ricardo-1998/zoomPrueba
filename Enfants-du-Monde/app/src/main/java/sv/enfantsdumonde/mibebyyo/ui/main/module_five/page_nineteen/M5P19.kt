package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_nineteen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM4P8Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P19Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_four.page_eight.M4P8FragmentDirections
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M5P19 : Fragment() {

    private lateinit var binding: FragmentM5P19Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM5P19Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M5P19Directions.openM5P20())
        }
        return binding.root
    }


}