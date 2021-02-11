package sv.enfantsdumonde.mibebyyo.ui.main.module_six

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6ContainerBinding


class M6ContainerFragment : Fragment() {

    private lateinit var binding: FragmentM6ContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM6ContainerBinding.inflate(inflater)
        return binding.root
    }


}