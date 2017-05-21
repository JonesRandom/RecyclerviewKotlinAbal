package masxdeveloper.recyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MyAdapter.onClick {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data : ArrayList<MyModel> = ArrayList()
        (1..20).mapTo(data) {
            MyModel(
                    "Nama Mantan " + it,
                    "Alamat Mantan " + it
            )
        }

        list.setHasFixedSize(true)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = MyAdapter(data , this)

    }

    override fun click(model: MyModel) {
        Toast.makeText(applicationContext , model.Nama , Toast.LENGTH_SHORT).show()
    }


}
