package sv.enfantsdumonde.mibebyyo.ui.main.module_four.page_two

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM4P2Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_two.M2P2FragmentDirections
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M4P2Fragment : Fragment() {

    private lateinit var binding: FragmentM4P2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM4P2Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M4P2FragmentDirections.openM4P3()
            )
        }

        return binding.root
    }

}