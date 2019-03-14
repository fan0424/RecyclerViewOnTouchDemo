package f.fan.recyclerviewontouchdemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by fan.feng on 2019/3/14.
 */
class ListAdapter : RecyclerView.Adapter<ListAdapter.ListHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) =
            ListHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_test, p0, false))

    override fun getItemCount() = 50

    override fun onBindViewHolder(p0: ListHolder, p1: Int) {
        p0.tvTest?.text = " item $p1"
    }

    class ListHolder:RecyclerView.ViewHolder{

        var tvTest: TextView? = null

        constructor(itemView: View): super(itemView){
            tvTest = itemView.findViewById(R.id.tvTest)
        }
    }

}