package id.ac.polbeng.nelia.listviewdanrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_view.*
import java.util.*

class ListviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        var dataArray: Array<String> =
            resources.getStringArray(R.array.jurusan)
        Arrays.sort(dataArray)
        var adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            dataArray)
        listview.adapter = adapter
    }
}