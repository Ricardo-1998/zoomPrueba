package sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_one

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P1Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_one.dialogs.M1P1D1Fragment
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M1P1Fragment : Fragment() {

    private lateinit var binding: FragmentM1P1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM1P1Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M1P1FragmentDirections.openM1P2()
            )
        }

        binding.openDialog.setOnClickListener {
            val fragment = M1P1D1Fragment(
                M1P1D1Fragment.OnClickListener {
                    when (it) {
                        1 -> navigateToDestination(
                            M1P1FragmentDirections.openM1P2()
                        )

                        2 -> navigateToDestination(
                            M1P1FragmentDirections.openM1P3FromP1()
                        )

                        3 -> navigateToDestination(
                            M1P1FragmentDirections.openM1P4FromP1()
                        )

                        4 -> navigateToDestination(
                            M1P1FragmentDirections.openM1P11FromP1()
                        )

                        5 -> navigateToDestination(
                            M1P1FragmentDirections.openM1P22FromP1()
                        )

                        6 -> navigateToDestination(
                            M1P1FragmentDirections.openM1P28FromP1()
                        )
                    }
                }
            )
            fragment.show(childFragmentManager, fragment.tag)
        }

        return binding.root
    }



}