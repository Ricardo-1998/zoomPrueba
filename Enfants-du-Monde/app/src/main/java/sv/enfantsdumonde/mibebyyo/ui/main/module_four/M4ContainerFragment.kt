package sv.enfantsdumonde.mibebyyo.ui.main.module_four

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM4ContainerBinding

class M4ContainerFragment : Fragment() {

    private lateinit var binding: FragmentM4ContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM4ContainerBinding.inflate(inflater)

        return binding.root
    }

}