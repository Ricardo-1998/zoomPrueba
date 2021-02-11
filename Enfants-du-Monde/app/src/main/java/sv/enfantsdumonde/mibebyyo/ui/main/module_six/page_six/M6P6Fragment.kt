package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_six

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P6Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P6Fragment : Fragment() {

    private  lateinit var binding: FragmentM6P6Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM6P6Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M6P6FragmentDirections.openM6P7())
        }

        return binding.root
    }



}