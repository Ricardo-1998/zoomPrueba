package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_ten

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P10Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P10Fragment : Fragment() {

    private lateinit var binding: FragmentM6P10Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P10Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M6P10FragmentDirections.openM6P11())
        }
        return binding.root
    }


}