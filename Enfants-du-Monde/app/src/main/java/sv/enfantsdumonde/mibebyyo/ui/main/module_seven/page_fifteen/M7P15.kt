package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_fifteen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P14Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P15Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_fourteen.M7P14Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P15 : Fragment() {

    private lateinit var binding: FragmentM7P15Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM7P15Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P15Directions.openM7P16())
        }

        return binding.root
    }

}