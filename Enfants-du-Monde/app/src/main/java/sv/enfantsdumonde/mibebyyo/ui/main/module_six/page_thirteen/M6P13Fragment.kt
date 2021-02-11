package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_thirteen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P13Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P13Fragment : Fragment() {
    private lateinit var binding: FragmentM6P13Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P13Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M6P13FragmentDirections.openM6P14())
        }
        return binding.root
    }
}