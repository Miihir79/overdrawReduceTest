package com.mihir.overdrawreducetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setBackgroundDrawable(null)  // the line that created the difference
        rv_recycler.layoutManager = GridLayoutManager(this@MainActivity,2)
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)
        list.add(6)
        rv_recycler.adapter = Adapter(list)
    }
}