package sv.enfantsdumonde.mibebyyo.ui.main.module_three

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM3ContainerBinding

class M3ContainerFragment : Fragment() {

    private lateinit var binding: FragmentM3ContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM3ContainerBinding.inflate(inflater)

        return binding.root
    }

}