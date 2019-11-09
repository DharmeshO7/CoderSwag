package dharmesh.padhiyar.coderswag.Controllers

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import dharmesh.padhiyar.coderswag.Adapters.ProductsAdapter
import dharmesh.padhiyar.coderswag.R
import dharmesh.padhiyar.coderswag.Services.DataService
import dharmesh.padhiyar.coderswag.Utilities.CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val catType = intent.getStringExtra(CATEGORY)!!

        val orientation = resources.configuration.orientation
        val screenSize = resources.configuration.screenWidthDp
        var spanCount = 2

        if (orientation == Configuration.ORIENTATION_LANDSCAPE || screenSize > 720) {
            spanCount = 4
        }

        productsListView.layoutManager = GridLayoutManager(this, spanCount)
        productsListView.adapter = ProductsAdapter(this, DataService.getProducts(catType))
    }
}
