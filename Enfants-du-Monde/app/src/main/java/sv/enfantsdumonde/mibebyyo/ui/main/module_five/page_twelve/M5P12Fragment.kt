package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_twelve

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P12Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M5P12Fragment : Fragment() {

    private lateinit var binding: FragmentM5P12Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM5P12Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M5P12FragmentDirections.openM513())
        }
        return binding.root
    }

}