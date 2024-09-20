package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    var list:ArrayList<DataModel> =ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerView=binding.userRV
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))
        list.add(DataModel(R.drawable.img,"Alex","hello i am a developer"))

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=AdapterClass(list,this)
        }
    }
