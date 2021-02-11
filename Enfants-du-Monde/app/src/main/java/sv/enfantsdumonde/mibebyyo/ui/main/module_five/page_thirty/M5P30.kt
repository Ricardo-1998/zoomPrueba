package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_thirty

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P30Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity


class M5P30 : Fragment() {

    private lateinit var binding: FragmentM5P30Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM5P30Binding.inflate(inflater)

        return binding.root
    }


}