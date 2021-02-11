package sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_twenty_two

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P21Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P22Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_twenty_one.M2P21Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M2P22 : Fragment() {

    private lateinit var binding: FragmentM2P22Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM2P22Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener{
            navigateToDestination(M2P22Directions.openM2P23())
        }

        return binding.root
    }


}