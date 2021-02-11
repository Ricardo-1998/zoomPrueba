package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_twenty_seven

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P27Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M5P27 : Fragment() {

    private lateinit var binding: FragmentM5P27Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM5P27Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M5P27Directions.openM5P28())
        }
        return binding.root
    }


}