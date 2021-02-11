package sv.enfantsdumonde.mibebyyo.ui.main.module_one.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM1P1D1Binding
import sv.enfantsdumonde.mibebyyo.ui.main.module_one.page_one.M1P1FragmentDirections

class M1P1D1Fragment (
    private val onClickListener: OnClickListener
) : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentM1P1D1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM1P1D1Binding.inflate(inflater)

        setClickListeners()

        return binding.root
    }

    class OnClickListener(private val clickListener: (itemId: Int) -> Unit) {
        fun onItemClicked(itemId: Int) = clickListener(itemId)
    }

    private fun setClickListeners() {
        binding.buttonItem1.setOnClickListener {
            dismiss()
            onClickListener.onItemClicked(1)
        }

        binding.buttonItem2.setOnClickListener {
            dismiss()
            onClickListener.onItemClicked(2)
        }

        binding.buttonItem3.setOnClickListener {
            dismiss()
            onClickListener.onItemClicked(3)
        }

        binding.buttonItem4.setOnClickListener {
            dismiss()
            onClickListener.onItemClicked(4)
        }

        binding.buttonItem5.setOnClickListener {
            dismiss()
            onClickListener.onItemClicked(5)
        }

        binding.buttonItem6.setOnClickListener {
            dismiss()
            onClickListener.onItemClicked(6)
        }
    }

}