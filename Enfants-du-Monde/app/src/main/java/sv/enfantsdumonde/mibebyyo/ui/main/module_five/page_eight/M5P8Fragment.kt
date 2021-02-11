package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_eight

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import org.koin.android.ext.android.bind
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P8Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M5P8Fragment : Fragment() {

    private lateinit var binding: FragmentM5P8Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentM5P8Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M5P8FragmentDirections.openM5P9())
        }
        return binding.root
    }

}