package sv.enfantsdumonde.mibebyyo.ui.main.module_four.page_one

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM4P1Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_four.dialogs.M4P1D1Fragment
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M4P1Fragment : Fragment() {

    private lateinit var binding: FragmentM4P1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM4P1Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M4P1FragmentDirections.openM4P2()
            )
        }

        binding.openDialog.setOnClickListener {
            setDialogClickListeners()
        }

        return binding.root
    }

    private fun setDialogClickListeners() {
        val fragment = M4P1D1Fragment(
            M4P1D1Fragment.OnClickListener {
                when (it) {
                    1 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P2()
                    )
                    2 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P3FromP1()
                    )
                    3 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P5FromP1()
                    )
                    4 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P6FromP1()
                    )
                    5 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P7FromP1()
                    )
                    6 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P8FromP1()
                    )
                    7 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P10FromP1()
                    )
                    8 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P11FromP1()
                    )
                    9 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P14FromP1()
                    )
                    10 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P17FromP1()
                    )
                    11 -> navigateToDestination(
                        M4P1FragmentDirections.openM4P18FromP1()
                    )
                }
            }
        )
        fragment.show(childFragmentManager, fragment.tag)
    }

}