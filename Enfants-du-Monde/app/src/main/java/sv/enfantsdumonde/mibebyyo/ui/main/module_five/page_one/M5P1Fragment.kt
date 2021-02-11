package sv.enfantsdumonde.mibebyyo.ui.main.module_five.page_one

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM5P1Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_five.dialogs.M5D1Fragment
import sv.enfantsdumonde.mibebyyo.utils.goToHome
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M5P1Fragment : Fragment() {

    private lateinit var binding: FragmentM5P1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM5P1Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M5P1FragmentDirections.openM5P2()
            )
        }

        binding.openDialog.setOnClickListener {
            setDialogClickListeners()
        }

        return binding.root
    }

    private fun setDialogClickListeners() {
        val fragment = M5D1Fragment(
            M5D1Fragment.OnClickListener {
                when(it){
                    1 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P2()
                    )
                    2 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P4fromP1()
                    )
                    3 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P5fromP1()
                    )
                    4 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P9fromP1()
                    )
                    5 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P11fromP1()
                    )
                    6 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P12fromP1()
                    )
                    7 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P13fromP1()
                    )
                    8 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P15fromP1()
                    )
                    9 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P16fromP1()
                    )
                    10 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P20fromP1()
                    )
                    11 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P24fromP1()
                    )
                    12 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P25fromP1()
                    )
                    13 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P27fromP1()
                    )
                    14 -> navigateToDestination(
                        M5P1FragmentDirections.openM5P28fromP1()
                    )

                }
            })
        fragment.show(childFragmentManager, fragment.tag)
    }

}