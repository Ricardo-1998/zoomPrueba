package sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_twenty_eight

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P20Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P28Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_twenty.M1P20FragmentDirections
import sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_sixteen.M2P16Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M1P28Fragment : Fragment() {

    private lateinit var binding: FragmentM1P28Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM1P28Binding.inflate(inflater)

        return binding.root
    }

}