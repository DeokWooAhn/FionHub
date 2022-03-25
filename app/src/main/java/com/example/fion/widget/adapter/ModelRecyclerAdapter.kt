package com.example.fion.widget.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.fion.model.CellType
import com.example.fion.model.Model
import com.example.fion.screen.base.BaseViewModel
import com.example.fion.util.mapper.ModelViewHolderMapper
import com.example.fion.util.provider.ResourceProvider
import com.example.fion.widget.adapter.listener.AdapterListener
import com.example.fion.widget.adapter.viewholder.ModelViewHolder

class ModelRecyclerAdapter<M: Model, VM: BaseViewModel>(
    private var modelList: List<Model>,
    private val viewModel: VM,
    private val resourcesProvider: ResourceProvider,
    private val adapterListener: AdapterListener
): ListAdapter<Model, ModelViewHolder<M>>(Model.DIFF_CALLBACK) {

    override fun getItemCount(): Int = modelList.size

    override fun getItemViewType(position: Int): Int = modelList[position].type.ordinal

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder<M> {
        return ModelViewHolderMapper.map(parent, CellType.values()[viewType], viewModel, resourcesProvider)
    }

    @Suppress("UMCHECKED_CAST")
    override fun onBindViewHolder(holder: ModelViewHolder<M>, position: Int) {
        with(holder) {
            bindData(modelList[position] as M)
            bindViews(modelList[position] as M, adapterListener)
        }
    }

    override fun submitList(list: MutableList<Model>?) {
        list?.let { modelList = it }
        super.submitList(list)
    }
}