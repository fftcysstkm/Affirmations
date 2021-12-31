package com.demo.android.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.demo.android.affirmations.adapter.ItemAdapter
import com.demo.android.affirmations.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDatesouce = DataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        // adapterプロパティに自作のアダプターを使用するよう設定。
        recyclerView.adapter = ItemAdapter(this, myDatesouce)

        recyclerView.setHasFixedSize(true)

    }
}