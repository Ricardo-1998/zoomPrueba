package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_three

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P3Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P3Fragment : Fragment() {

    private lateinit var binding: FragmentM7P3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM7P3Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P3FragmentDirections.openM7P4())
        }
        return binding.root
    }


}