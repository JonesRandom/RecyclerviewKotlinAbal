
package masxdeveloper.recyclerviewkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_list.view.*

/**
 * Created by Masx Developer on 5/20/17.
 * https://masx-dev.blogspot.com
 */

class MyAdapter(val data : ArrayList<MyModel> , val listener : onClick) : RecyclerView.Adapter<MyAdapter.MyHolder>() {
    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: MyHolder, position: Int) = holder.bind(
            data[position] , listener
    )

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder = MyHolder(
            LayoutInflater.from(parent?.context).inflate(R.layout.row_list , parent , false)
    )

    class MyHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bind(model : MyModel , listen : onClick) = with(itemView) {

            nama.text = model.Nama
            alamat.text = model.Alamat

            setOnClickListener { listen.click(model) }

        }
    }

    interface onClick{
        fun click(model : MyModel)
    }
}