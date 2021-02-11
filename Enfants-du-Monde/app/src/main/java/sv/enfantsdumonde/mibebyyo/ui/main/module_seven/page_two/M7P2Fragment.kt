package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_two

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P2Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P2Fragment : Fragment() {

    private lateinit var binding: FragmentM7P2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM7P2Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P2FragmentDirections.openM7P3())
        }
        return binding.root
    }


}