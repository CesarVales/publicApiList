package com.example.testingrecycle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class cardAPIAdapter: RecyclerView.Adapter<cardAPIAdapter.cardViewholder>() {
     inner class cardViewholder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.cardapi_view_holder,parent,false    )
    ) {
         fun onBind(data[position]) {

         }
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewholder {
        return  cardViewholder(parent)
    }

    override fun onBindViewHolder(holder: cardViewholder, position: Int) {
        holder.onBind()
    }

    override fun getItemCount(): Int {
        return
    }


}