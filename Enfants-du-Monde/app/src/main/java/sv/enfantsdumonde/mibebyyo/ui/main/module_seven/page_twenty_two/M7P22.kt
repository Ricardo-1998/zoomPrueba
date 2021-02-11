package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_twenty_two

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P22Binding
 import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P22 : Fragment() {

    private lateinit var binding: FragmentM7P22Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM7P22Binding.inflate(inflater)


        return binding.root
    }


}