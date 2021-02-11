package sv.enfantsdumonde.mibebyyo.ui.main.module_four.page_seven

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM4P7Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_four.page_six.M4P6FragmentDirections
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M4P7Fragment : Fragment() {

    private lateinit var binding: FragmentM4P7Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM4P7Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M4P7FragmentDirections.openM4P8())
        }

        return binding.root
    }

}