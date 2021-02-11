package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_twenty_seven

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P27Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_twenty.M6P20Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P27 : Fragment() {

    private lateinit var binding: FragmentM6P27Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P27Binding.inflate(inflater)

        return binding.root
    }


}