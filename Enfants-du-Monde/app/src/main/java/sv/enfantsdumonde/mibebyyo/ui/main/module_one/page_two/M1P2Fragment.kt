package sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_two

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P2Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M1P2Fragment : Fragment() {

    lateinit var binding: FragmentM1P2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM1P2Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M1P2FragmentDirections.openM1P3())
        }

        return binding.root
    }

}