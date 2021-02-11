package sv.enfantsdumonde.mibebyyo.utils

import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import sv.enfantsdumonde.mibebyyo.R

@Suppress("UNCHECKED_CAST")
@BindingAdapter("app:setList")
fun <T> bindRecyclerViewWithList(recyclerView: RecyclerView, data: T?) {
    data?.let {
        if (recyclerView.adapter is GenericAdapter<*>) {
            (recyclerView.adapter as GenericAdapter<T>).setData(data)
        }
    }
}

@BindingAdapter("app:setImage")
fun bindImageViewWithImage(imageView: ImageView, id: Int?) {
    id?.let {
        when (id) {
            1 -> {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        imageView.context,
                        R.drawable.m1f1
                    )
                )
            }
            2 -> {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        imageView.context,
                        R.drawable.m2f1
                    )
                )
            }
            3 -> {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        imageView.context,
                        R.drawable.m3f1
                    )
                )
            }
            4 -> {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        imageView.context,
                        R.drawable.m4f1
                    )
                )
            }
            5 -> {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        imageView.context,
                        R.drawable.m5f1
                    )
                )
            }
            6 -> {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        imageView.context,
                        R.drawable.m6f1
                    )
                )
            }
            7 -> {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        imageView.context,
                        R.drawable.m7f1
                    )
                )
            }
        }
    }
}