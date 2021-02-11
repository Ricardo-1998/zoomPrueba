package sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_eleven

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P11Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_ten.M1P10FragmentDirections
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M1P11Fragment : Fragment() {
    private lateinit var binding: FragmentM1P11Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM1P11Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener{
            navigateToDestination(M1P11FragmentDirections.openM1P12())
        }

        return binding.root
    }


}