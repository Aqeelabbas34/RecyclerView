package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class AdapterClass(var list: ArrayList<DataModel>,context: Context):RecyclerView.Adapter<AdapterClass.itemViewHolder>() {
    inner class itemViewHolder(view: View):RecyclerView.ViewHolder(view)
    {
     var images=itemView.findViewById<ImageView>(R.id.image_id)
     var names=itemView.findViewById<TextView>(R.id.TV_name)
        var desc=itemView.findViewById<TextView>(R.id.TV_description)
        fun bind(Model:DataModel){
        images.setImageResource(Model.image)
         names.text=Model.name
         desc.text=Model.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
       var view=LayoutInflater.from(parent.context).inflate(R.layout.card_view,parent ,false)
        return itemViewHolder(view)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}