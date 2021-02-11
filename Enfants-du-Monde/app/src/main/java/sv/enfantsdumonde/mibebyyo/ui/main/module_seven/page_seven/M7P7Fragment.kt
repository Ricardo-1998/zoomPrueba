package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_seven

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P7Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P7Fragment : Fragment() {
    private lateinit var binding: FragmentM7P7Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM7P7Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P7FragmentDirections.openM7P8())
        }
        return binding.root
    }
}