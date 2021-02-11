package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_twenty_six

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P26Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M5P26 : Fragment() {

    private lateinit var binding: FragmentM5P26Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM5P26Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M5P26Directions.openM5P27())
        }
        return binding.root
    }


}