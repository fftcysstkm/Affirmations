package com.demo.android.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.demo.android.affirmations.R
import com.demo.android.affirmations.model.Affirmation

/*
* 格言をRecyclerViewに適用させるアダプター
*
* */
// 文字列リソースを取得するためにContexが必要（リソースなどアプリ内横断的な情報を保持）
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // ビューホルダー：個々のリスト項目ビューへの参照を保持する
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    // RecyclerView の新しいビューホルダーを作成する
    // parent:子リスト項目の親となるビューグループ（RecyclerViewが該当する）
    // viewType:子リスト項目が複数のビュータイプの場合に必要。今回は気にする必要なし。
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    // リスト項目ビューの内容を置き換えるのに用いられるメソッド（レイアウトマネージャがこのメソッドを用いる）
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // AffirmationはStringと画像のリソースIDを保持
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    // データセットのサイズを返す(この書き方は省略記法)
    override fun getItemCount() = dataset.size
}