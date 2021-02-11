package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_seventeen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P16Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P17Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_sixteen.M7P16Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P17 : Fragment() {

    private lateinit var binding: FragmentM7P17Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM7P17Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
           navigateToDestination(M7P17Directions.openM7P18())
        }

        return binding.root
    }


}