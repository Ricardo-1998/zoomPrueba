package sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_three

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P3Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M2P3Fragment : Fragment() {

    private lateinit var binding: FragmentM2P3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM2P3Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M2P3FragmentDirections.openM2P4()
            )
        }

        return binding.root
    }

}