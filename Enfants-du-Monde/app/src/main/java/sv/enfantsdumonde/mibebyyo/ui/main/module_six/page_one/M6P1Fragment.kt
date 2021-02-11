package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_one

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P1Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_six.dialog.M6P1D1Fragment
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P1Fragment : Fragment() {

    private lateinit var binding: FragmentM6P1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM6P1Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M6P1FragmentDirections.openM6P2())
        }

        binding.openDialog.setOnClickListener {
            setDialogClickListeners()
        }

        return binding.root
    }


    private fun setDialogClickListeners() {
        val fragment = M6P1D1Fragment(
            M6P1D1Fragment.OnClickListener {
                when (it) {
                    1 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P2()
                    )

                    2 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P4fromP1()
                    )

                    3 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P5fromP1()
                    )

                    4 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P8fromP1()
                    )

                    5 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P9fromP1()
                    )

                    6 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P11fromP1()
                    )

                    7 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P12fromP1()
                    )

                    8 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P13fromP1()
                    )

                    9 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P14fromP1()
                    )

                    10 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P15fromP1()
                    )

                    11 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P17fromP1()
                    )

                    12 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P19fromP1()
                    )

                    13 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P20fromP1()
                    )
                    14 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P21from1()
                    )
                    15 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P22from1()
                    )
                    16 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P23from1()
                    )
                    17 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P25from1()
                    )
                    18 -> navigateToDestination(
                        M6P1FragmentDirections.openM6P26from1()
                    )


                }
            })
        fragment.show(childFragmentManager, fragment.tag)
    }

}