package com.sumittrehan.firstkotlinapp


import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class HobbiesAdapter(var context: Context, var hobbiesList:List<String>): RecyclerView.Adapter<HobbiesAdapter.HobbyViewHolder>() {

    private val TAG:String = "HobbiesAdapter"

    inner class HobbyViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var textView: TextView? = null
        init {
            textView = view.findViewById(R.id.list_item_text_view)
            view.setOnClickListener {
                Toast.makeText(context, textView!!.text, Toast.LENGTH_SHORT).show()
            }
        }

        fun bindData(hobby:String) {
            this.textView!!.text = hobby
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyViewHolder {
        Log.d(TAG, "onCreateViewHolder()")
        val view:View  = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return HobbyViewHolder(view)
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder() for position: $position")
        holder.bindData(hobbiesList.get(position))
    }

    override fun getItemCount(): Int {
        return hobbiesList.size
    }
}


