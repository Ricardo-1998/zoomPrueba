package sv.enfantsdumonde.mibebyyo.ui.main.module_three.page_nineteen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM3P19Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity

class M3P19 : Fragment() {

    private lateinit var binding: FragmentM3P19Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM3P19Binding.inflate(inflater)

        return binding.root
    }


}