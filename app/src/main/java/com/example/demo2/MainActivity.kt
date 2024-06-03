package com.example.demo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {
    private lateinit var myRecyclerView:RecyclerView
    lateinit var newsArrayList:ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView=findViewById(R.id.recyclerview)
        var newsImageArray= arrayOf(R.drawable.dhoni,
                                    R.drawable.rohit,
                                    R.drawable.virat,
                                    R.drawable.rahul,
                                    R.drawable.bumrah,
                                    R.drawable.shami,
                                    R.drawable.arjun,
                                    R.drawable.alluarjun,
                                    R.drawable.prabahas,
                                    R.drawable.ramcharan,
                                    R.drawable.rajamouli,
                                    R.drawable.mahesh
                                                    )
        var newsHeadingArray= arrayOf("Mahender Singh Dhoni","Rohit Sharma","Virat Kohli",
            "KL Rahul","Bumrah","Mohammed Shami","Nani","Allu Arjun","Prabahas","Ram Charan","SS Rajamouli",
            "Mahesh Babu")
        myRecyclerView.layoutManager=LinearLayoutManager(this)
        newsArrayList= arrayListOf<News>()


        for (eachIndex in newsImageArray.indices){
            val news=News(newsHeadingArray[eachIndex],newsImageArray[eachIndex])
            newsArrayList.add(news)

        }
        myRecyclerView.adapter=MyAdapter(newsArrayList,this)


    }

}