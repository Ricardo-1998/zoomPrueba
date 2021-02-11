package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_eighteen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P17Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P18Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_seventeen.M6P17Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P18 : Fragment() {
    private lateinit var binding: FragmentM6P18Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P18Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener{
            navigateToDestination(M6P18Directions.openM6P19())
        }

        return binding.root
    }


}