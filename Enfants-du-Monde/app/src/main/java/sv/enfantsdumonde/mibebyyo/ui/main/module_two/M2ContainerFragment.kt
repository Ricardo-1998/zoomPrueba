package sv.enfantsdumonde.mibebyyo.ui.main.module_two

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2ContainerBinding

class M2ContainerFragment : Fragment() {

    private lateinit var binding: FragmentM2ContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM2ContainerBinding.inflate(inflater)

        return binding.root
    }

}