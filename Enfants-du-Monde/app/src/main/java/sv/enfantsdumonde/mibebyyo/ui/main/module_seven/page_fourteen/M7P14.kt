package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_fourteen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P13Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P14Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_thirteen.M7P13Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M7P14 : Fragment() {

    private lateinit var binding: FragmentM7P14Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM7P14Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P14Directions.openM7P15())
        }

        return binding.root
    }

}