package sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_six

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P6Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M1P6Fragment : Fragment() {

    private lateinit var binding: FragmentM1P6Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM1P6Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M1P6FragmentDirections.openM1P7())
        }

        return binding.root
    }


}