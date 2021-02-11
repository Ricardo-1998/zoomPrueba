package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_eleven

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM3P3Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P11Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_three.page_three.M3P3FragmentDirections
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P11 : Fragment() {

    private lateinit var binding: FragmentM7P11Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM7P11Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P11Directions.openM7P12())
        }

        return binding.root
    }

    
}