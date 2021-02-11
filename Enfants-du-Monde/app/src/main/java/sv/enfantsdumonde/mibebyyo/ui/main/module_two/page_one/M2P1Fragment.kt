package sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_one

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P1Binding
import sv.enfantsdumonde.mibebyyo.ui.main.MainActivity
import sv.enfantsdumonde.mibebyyo.ui.main.module_two.dialogs.M2P1D1Fragment
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination

class M2P1Fragment : Fragment() {

    private lateinit var binding: FragmentM2P1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM2P1Binding.inflate(inflater)

        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(
                M2P1FragmentDirections.openM2P2()
            )
        }

        binding.textView3.setOnClickListener {
            val fragment = M2P1D1Fragment(
                M2P1D1Fragment.OnClickListener {
                    when (it) {
                        1 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P2()
                        )
                        2 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P3FromP1()
                        )
                        3 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P5FromP1()
                        )
                        4 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P10FromP1()
                        )
                        5 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P11FromP1()
                        )
                        6 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P12FromP1()
                        )
                        7 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P16FromP1()
                        )
                        8 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P17FromP1()
                        )
                        9 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P18FromP1()
                        )
                        10 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P19FromP1()
                        )
                        11 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P20FromP1()
                        )
                        12 -> navigateToDestination(
                            M2P1FragmentDirections.openM2P21FromP1()
                        )
                    }
                }
            )
            fragment.show(childFragmentManager, fragment.tag)
        }

        return binding.root
    }

}