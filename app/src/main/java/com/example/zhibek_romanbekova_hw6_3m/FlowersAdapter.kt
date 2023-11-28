package com.example.zhibek_romanbekova_hw6_3m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.zhibek_romanbekova_hw6_3m.databinding.ItemFlowersBinding

class FlowersAdapter(private var flowersList:ArrayList<String>):Adapter<FlowersAdapter.FlowersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowersViewHolder {
        return FlowersViewHolder(ItemFlowersBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = flowersList.size

    override fun onBindViewHolder(holder: FlowersViewHolder, position: Int) {
        holder.bind(flowersList[position])
    }

    inner class FlowersViewHolder(private var binding: ItemFlowersBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(s: String) {
            binding.listName.text = s
        }
    }
}