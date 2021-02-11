package sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_twenty_six

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM6P26Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_six.page_twenty_six.M6P26Directions
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination


class M6P26 : Fragment() {

    private lateinit var binding: FragmentM6P26Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM6P26Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener{
            navigateToDestination(M6P26Directions.openM6P27())
        }
//        binding.includeBottomButtons.ib_home.setOnClickListener {
//            val intent = Intent(this.context, MainActivity::class.java)
//            startActivity(intent)
//        }
        return binding.root
    }


}