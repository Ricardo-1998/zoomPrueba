package sv.enfantsdumonde.mibebyyo.ui.main.module_one

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1ContainerBinding

class M1ContainerFragment : Fragment() {

    private lateinit var binding: FragmentM1ContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM1ContainerBinding.inflate(inflater)

        return binding.root
    }

}