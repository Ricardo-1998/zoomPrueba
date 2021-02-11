package sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_twenty

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P20Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M2P20 : Fragment() {

    private lateinit var binding: FragmentM2P20Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM2P20Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener{
           navigateToDestination(M2P20Directions.openM2P21())
        }

        return binding.root
    }


}