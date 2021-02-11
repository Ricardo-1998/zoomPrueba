package sv.enfantsdumonde.mibebyyo.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import sv.enfantsdumonde.mibebyyo.data.models.Module
import sv.enfantsdumonde.mibebyyo.databinding.ItemModuleBinding
import sv.enfantsdumonde.mibebyyo.utils.GenericAdapter

class ModulesAdapter(
    private val onClickListener: OnClickListener
): ListAdapter<Module, ModulesAdapter.ModulesViewHolder>(DiffCallback),
    GenericAdapter<List<Module>>{

    companion object DiffCallback : DiffUtil.ItemCallback<Module>() {
        override fun areItemsTheSame(
            oldItem: Module,
            newItem: Module
        ): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(
            oldItem: Module,
            newItem: Module
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }

    class OnClickListener(private val clickListener: (module: Module) -> Unit) {
        fun onModuleClicked(module: Module) = clickListener(module)
    }

    class ModulesViewHolder(private val binding: ItemModuleBinding) :
            RecyclerView.ViewHolder(binding.root) {

        fun bind(module: Module) {
            binding.module = module
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModulesViewHolder {
        return ModulesViewHolder(
            ItemModuleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ModulesViewHolder, position: Int) {
        val module = getItem(position)
        holder.itemView.setOnClickListener {
            onClickListener.onModuleClicked(module)
        }

        holder.bind(module)
    }

    override fun setData(data: List<Module>) {
        submitList(data)
    }

}