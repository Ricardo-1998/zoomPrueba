package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_sixteen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P15Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P16Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_fifteen.M7P15Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P16 : Fragment() {

    private lateinit var binding: FragmentM7P16Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM7P16Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P16Directions.openM7P17())
        }

        return binding.root
    }


}