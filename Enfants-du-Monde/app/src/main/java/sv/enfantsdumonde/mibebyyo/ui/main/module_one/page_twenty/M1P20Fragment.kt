package sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_twenty

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P20Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M1P20Fragment : Fragment() {

    lateinit var binding: FragmentM1P20Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM1P20Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M1P20FragmentDirections.openM1P21()
            )
        }

        return binding.root
    }


}