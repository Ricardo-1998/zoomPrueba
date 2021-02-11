package sv.enfantsdumonde.mibebyyo.ui.main.module_seven

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7ContainerBinding


class M7ContainerFragment : Fragment() {

    private lateinit var binding: FragmentM7ContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM7ContainerBinding.inflate(inflater)
        return binding.root
    }


}