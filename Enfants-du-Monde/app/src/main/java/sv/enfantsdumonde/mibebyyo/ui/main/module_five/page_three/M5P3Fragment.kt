package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_three

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P3Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M5P3Fragment : Fragment() {

    private  lateinit var binding: FragmentM5P3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM5P3Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M5P3FragmentDirections.openM5P4()
            )
        }

        return binding.root
    }

}