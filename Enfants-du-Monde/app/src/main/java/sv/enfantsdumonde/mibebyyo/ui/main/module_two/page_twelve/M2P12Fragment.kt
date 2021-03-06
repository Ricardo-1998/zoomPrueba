package sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_twelve

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P11Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P12Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_eleven.M2P11Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M2P12Fragment : Fragment() {
    private lateinit var binding: FragmentM2P12Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM2P12Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M2P12FragmentDirections.openM2P13())
        }

        return binding.root
    }
}