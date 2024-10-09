package com.example.noteapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.noteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val task  = arrayListOf<String>()
        task.add("Office at 9:00am")
        task.add("Meeting at 11:00am")
        task.add("lunch at 2:00pm")
        task.add("Gym at 8:00pm")
        task.add("Learning new topics of App development  at 10:00pm")
        task.add("Dinner at 12:00pm")

        val myAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,task)
        binding.viewList.adapter= myAdapter

        binding.viewList.setOnItemClickListener { parent, view, position, id ->
            val item = "Clicked on item $position" + (view as TextView).text.toString()
            Toast.makeText(this, item, Toast.LENGTH_SHORT).show()


        }

    }
}