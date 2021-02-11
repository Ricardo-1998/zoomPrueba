package sv.enfantsdumonde.mibebyyo.ui.main.module_seven.page_one

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM7P1Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_seven.dialog.M7P1D1Fragment

import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M7P1Fragment : Fragment() {

    private lateinit var binding: FragmentM7P1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentM7P1Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M7P1FragmentDirections.openM7P2())
        }
        binding.openDialog.setOnClickListener {
            setDialogClickListeners()
        }
        return binding.root
    }

    private fun setDialogClickListeners() {
        val fragment = M7P1D1Fragment(
            M7P1D1Fragment.OnClickListener{
                when(it){
                    1 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P2()
                    )
                    2 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P3fromP1()
                    )
                    3 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P4fromP1()
                    )
                    4 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P5fromP1()
                    )
                    5 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P6fromP1()
                    )
                    6 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P7fromP1()
                    )
                    7 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P8fromP1()
                    )
                    8 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P9fromP1()
                    )
                    9 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P10fromP1()
                    )
                    10 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P13fromP1()
                    )
                    11 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P15fromP1()
                    )
                    12 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P16fromP1()
                    )
                    13 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P17fromP1()
                    )
                    14 -> navigateToDestination(
                        M7P1FragmentDirections.openM7P18fromP1()
                    )
                }
            })
        fragment.show(childFragmentManager, fragment.tag)
    }


}