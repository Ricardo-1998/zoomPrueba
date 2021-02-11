package sv.enfantsdumonde.mibebyyo.ui.main.module_three.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM3P1D1Binding

class M3P1D1Fragment(
    private val onClickListener: OnClickListener
) : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentM3P1D1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentM3P1D1Binding.inflate(inflater)

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

        binding.buttonItem7.setOnClickListener {
            dismiss()
            onClickListener.onItemClicked(7)
        }

        binding.buttonItem8.setOnClickListener {
            dismiss()
            onClickListener.onItemClicked(8)
        }

        binding.buttonItem9.setOnClickListener {
            dismiss()
            onClickListener.onItemClicked(9)
        }

    }

}