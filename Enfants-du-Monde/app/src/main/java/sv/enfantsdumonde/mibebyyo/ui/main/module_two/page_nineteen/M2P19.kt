package sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_nineteen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P15Binding
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P19Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_fifteen.M1P15FragmentDirections
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M2P19 : Fragment() {
    private lateinit var binding: FragmentM2P19Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM2P19Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener{
            navigateToDestination(M2P19Directions.openM2P20())
        }

        return binding.root
    }


}