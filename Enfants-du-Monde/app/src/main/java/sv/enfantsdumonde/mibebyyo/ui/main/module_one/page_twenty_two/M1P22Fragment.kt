package sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_twenty_two

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P22Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M1P22Fragment : Fragment() {

    lateinit var binding: FragmentM1P22Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM1P22Binding.inflate(inflater)


        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M1P22FragmentDirections.openM1P23()
            )
        }

        return binding.root
    }


}