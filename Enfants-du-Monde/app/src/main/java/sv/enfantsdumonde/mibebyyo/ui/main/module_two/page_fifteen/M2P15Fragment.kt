package sv.enfantsdumonde.mibebyyo.ui.main.module_two.page_fifteen


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ImageView
import kotlinx.android.synthetic.main.bottom_buttons.view.*
import kotlinx.android.synthetic.main.fragment_m2_p15.*
import sv.enfantsdumonde.mibebyyo.databinding.FragmentM2P15Binding
import sv.enfantsdumonde.mibebyyo.utils.navigateToDestination
import kotlin.math.max
import kotlin.math.min


class M2P15Fragment : Fragment() {
    private lateinit var scaleGestureDetector: ScaleGestureDetector
    private var scaleFactor = 1.0f
    private lateinit var imageView: ImageView

    private lateinit var binding: FragmentM2P15Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentM2P15Binding.inflate(inflater)
        binding.includeBottomButtons.ib_next.setOnClickListener {
            navigateToDestination(M2P15FragmentDirections.openM2P16())
        }


        this.binding.violentometro.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent): Boolean {
                scaleGestureDetector.onTouchEvent(event)
                return true
            }
        })

        scaleGestureDetector = ScaleGestureDetector(this.context, ScaleListener())


        return binding.root
    }


    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScale(scaleGestureDetector: ScaleGestureDetector): Boolean {
            scaleFactor *= scaleGestureDetector.scaleFactor
            scaleFactor = max(1f, min(scaleFactor, 10.0f))
            imageView.scaleX = scaleFactor
            imageView.scaleY = scaleFactor
            return true
        }
    }

}