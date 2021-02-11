package sv.enfantsdumonde.mibebyyo.ui.main.module_five

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5ContainerBinding

class M5ContainerFragment : Fragment() {

    private lateinit var binding: FragmentM5ContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM5ContainerBinding.inflate(inflater)

        return binding.root
    }

}