package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_twenty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P20Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P20 : Fragment() {

    private lateinit var binding: FragmentM6P20Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P20Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener{
            navigateToDestination(M6P20Directions.openM6P21())
        }

        return binding.root
    }


}