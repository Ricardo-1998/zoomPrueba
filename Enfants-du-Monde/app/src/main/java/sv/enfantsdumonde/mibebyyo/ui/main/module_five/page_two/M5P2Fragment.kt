package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_two

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P2Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M5P2Fragment : Fragment() {

    private lateinit var binding: FragmentM5P2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM5P2Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M5P2FragmentDirections.openM5P3()
            )
        }

        return binding.root
    }

}