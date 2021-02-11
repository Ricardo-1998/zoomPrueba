package sv.enfantsdumonde.mibebyyo.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.koin.android.ext.android.inject
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.adapters.ModulesAdapter
import sv.enfantsdumonde.mibebyyo.databinding.FragmentHomeBinding
import sv.enfantsdumonde.mibebyyo.utils.navigateToModule

class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by inject()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater).apply {
            lifecycleOwner = this@HomeFragment
            viewModel = this@HomeFragment.viewModel
        }

        binding.rvModules.adapter =
            ModulesAdapter(ModulesAdapter.OnClickListener { module ->
                navigateToModule(module.id)
            })

        return binding.root
    }



}