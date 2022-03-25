package com.example.fion.util.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.fion.databinding.ViewholderEmptyBinding
import com.example.fion.model.CellType
import com.example.fion.model.Model
import com.example.fion.screen.base.BaseViewModel
import com.example.fion.util.provider.ResourceProvider
import com.example.fion.widget.adapter.viewholder.EmptyViewHolder
import com.example.fion.widget.adapter.viewholder.ModelViewHolder

object ModelViewHolderMapper {

    @Suppress("UNCHECKED_CAST")
    fun <M: Model> map(
        parent: ViewGroup,
        type: CellType,
        viewModel: BaseViewModel,
        resourceProvider: ResourceProvider
    ): ModelViewHolder<M> {
        val inflater = LayoutInflater.from(parent.context)
        val viewHolder = when (type) {
            CellType.EMPTY_CELL -> EmptyViewHolder(
                ViewholderEmptyBinding.inflate(inflater, parent, false),
                viewModel,
                resourceProvider
            )
        }
        return viewHolder as ModelViewHolder<M>
    }
}