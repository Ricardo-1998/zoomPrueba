package sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_ten

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P10Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_nine.M2P9FragmentDirections
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M2P10Fragment : Fragment() {

    private lateinit var binding: FragmentM2P10Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM2P10Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M2P10FragmentDirections.openM2P11())
        }

        return binding.root
    }


}