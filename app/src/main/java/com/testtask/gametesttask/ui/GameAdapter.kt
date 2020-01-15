package com.testtask.gametesttask.ui

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.testtask.gametesttask.R
import java.util.ArrayList

class GameAdapter(private val list: ArrayList<String>, private val context: Context) :
    RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.cell_color, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val color: String = list[position]
        holder.ivItem.setBackgroundColor(Color.parseColor(color))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivItem = itemView.findViewById<ImageView>(R.id.ivItem)!!
    }
}