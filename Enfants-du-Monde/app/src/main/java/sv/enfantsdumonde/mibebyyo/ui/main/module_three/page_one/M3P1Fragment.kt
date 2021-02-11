package sv.enfantsdumonde.mibebyyo.ui.main.module_three.page_one

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM3P1Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_three.dialogs.M3P1D1Fragment
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M3P1Fragment : Fragment() {

    private lateinit var binding: FragmentM3P1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM3P1Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M3P1FragmentDirections.openM3P2()
            )
        }

        binding.openDialog.setOnClickListener {
            setDialogClickListeners()
        }

        return binding.root
    }

    private fun setDialogClickListeners() {
        val fragment = M3P1D1Fragment(
            M3P1D1Fragment.OnClickListener {
                when (it) {
                    1 -> navigateToDestination(
                        M3P1FragmentDirections.openM3P2()
                    )
                    2 -> navigateToDestination(
                        M3P1FragmentDirections.openM3P4FromP1()
                    )
                    3 -> navigateToDestination(
                        M3P1FragmentDirections.openM3P5FromP1()
                    )
                    4 -> navigateToDestination(
                        M3P1FragmentDirections.openM3P6FromP1()
                    )
                    5 -> navigateToDestination(
                        M3P1FragmentDirections.openM3P7FromP1()
                    )
                    6 -> navigateToDestination(
                        M3P1FragmentDirections.openM3P8FromP1()
                    )
                    7 -> navigateToDestination(
                        M3P1FragmentDirections.openM3P9FromP1()
                    )
                    8 -> navigateToDestination(
                        M3P1FragmentDirections.openM3P14FromP1()
                    )
                    9 -> navigateToDestination(
                        M3P1FragmentDirections.openM3P16FromP1()
                    )
                }
            }
        )
        fragment.show(childFragmentManager, fragment.tag)
    }

}