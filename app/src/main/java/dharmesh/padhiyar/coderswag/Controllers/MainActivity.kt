package dharmesh.padhiyar.coderswag.Controllers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dharmesh.padhiyar.coderswag.Adapters.CategoryRecyclerAdapter
import dharmesh.padhiyar.coderswag.R
import dharmesh.padhiyar.coderswag.Services.DataService
import dharmesh.padhiyar.coderswag.Utilities.CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(CATEGORY, category.title)
            startActivity(productIntent)
        }

        listView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        listView.layoutManager = layoutManager
        listView.setHasFixedSize(true)
    }
}
