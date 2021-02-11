package sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_fourteen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P13Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P14Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_thirteen.M2P13FragmentDirections
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M2P14Fragment : Fragment() {
    private lateinit var binding: FragmentM2P14Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM2P14Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M2P14FragmentDirections.openM2P15())
        }

        return binding.root
    }
}