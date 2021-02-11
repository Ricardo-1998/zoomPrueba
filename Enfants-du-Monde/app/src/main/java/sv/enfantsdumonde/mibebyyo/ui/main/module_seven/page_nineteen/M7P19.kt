package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_nineteen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P19Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_nineteen.M7P19Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P19 : Fragment() {

    private lateinit var binding: FragmentM7P19Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM7P19Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P19Directions.openM7P20())
        }

        return binding.root
    }

     
}