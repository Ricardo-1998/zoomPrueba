package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_four

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P4Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M5P4Fragment : Fragment() {

    private  lateinit var binding: FragmentM5P4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM5P4Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M5P4FragmentDirections.openM5P5()
            )
        }

        return binding.root
    }

}