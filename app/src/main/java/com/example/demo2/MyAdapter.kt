package com.example.demo2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private var newsArrayList:ArrayList<News>, var context:Activity):
RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{

    //to create new instance when layout manager fails
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
          val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_design,parent,false)
        return MyViewHolder(itemView)
    }
    //populate items with data

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
          val currentItem=newsArrayList[position]
         holder.headingNewsadapter.text=currentItem.newsHeading
        holder.headingimgsadapter.setImageResource(currentItem.newsImage)
    }

    //how many list items are present in your array
    override fun getItemCount(): Int {
        return newsArrayList.size
    }
    //it holds views so that views should not create every time so that memory can be saved
    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val headingNewsadapter=itemView.findViewById<TextView>(R.id.tvnewsheading)
        val headingimgsadapter=itemView.findViewById<ShapeableImageView>(R.id.shapableImageView)

    }
}