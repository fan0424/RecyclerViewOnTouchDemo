package f.fan.recyclerviewontouchdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvList.layoutManager = LinearLayoutManager(this)

        var adapter = ListAdapter()

        rvList.adapter = adapter

        rvList.setOnTouchListener(RecyclerViewOnTouchListener(this, object : RecyclerViewOnTouchListener.OnClickListener {

            override fun onSingleClick(touthX: Int, touchY: Int) {

                val halfWidth = (rvList?.width ?: 0) / 2

                if(halfWidth > touthX){
                    Toast.makeText(this@MainActivity, "点击到了左侧", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this@MainActivity, "点击到了右侧", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onDoubleClick() {
                Toast.makeText(this@MainActivity, "纳尼，竟然被双击了", Toast.LENGTH_SHORT).show()
            }
        }))
    }
}
