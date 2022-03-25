package com.example.fion.widget.adapter.viewholder

import com.example.fion.databinding.ViewholderEmptyBinding
import com.example.fion.model.Model
import com.example.fion.screen.base.BaseViewModel
import com.example.fion.util.provider.ResourceProvider
import com.example.fion.widget.adapter.listener.AdapterListener

class EmptyViewHolder(
    private val binding: ViewholderEmptyBinding,
    viewModel: BaseViewModel,
    resourceProvider: ResourceProvider
): ModelViewHolder<Model>(binding, viewModel, resourceProvider) {

    override fun reset() = Unit

    override fun bindViews(model: Model, adapterListener: AdapterListener) = Unit

}