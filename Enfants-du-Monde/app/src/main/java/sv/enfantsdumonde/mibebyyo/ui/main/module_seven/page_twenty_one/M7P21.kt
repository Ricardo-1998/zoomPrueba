package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_twenty_one

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P21Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_twenty_one.M7P21Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P21 : Fragment() {

    private lateinit var binding: FragmentM7P21Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM7P21Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P21Directions.openM7P22())
        }

        return binding.root
    }


}