package com.puneet.sportslist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import models.Hit
import models.Result

class SearchResultsAdapter(public val context: Context) :
    RecyclerView.Adapter<SearchResultsAdapter.ResultViewHolder>() {
    var data: List<Hit>


    init {
        data = ArrayList<Hit>()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View

        view = layoutInflater.inflate(R.layout.recycelerview_single_item, parent, false)
        return ResultViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.data?.size;
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        holder.bind(data.get(position), context);
    }


    fun setDataSource(data: List<Hit>) {
        this.data = data;
        notifyDataSetChanged()
    }

    inner class ResultViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.textview)

        fun bind(hit: Hit?, context: Context) {

            textView.text = hit?.title
            itemView.setOnClickListener(View.OnClickListener {
                (context as AdapterInteractionListener).onItemClick(hit!!.url)
            })
        }

    }

}