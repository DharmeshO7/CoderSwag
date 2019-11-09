package dharmesh.padhiyar.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dharmesh.padhiyar.coderswag.Model.Product
import dharmesh.padhiyar.coderswag.R

class ProductsAdapter(val context: Context, val productList: List<Product>) :
    RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return productList.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.product_row, parent, false))
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage: ImageView = itemView.findViewById(R.id.productImage)
        val productTitle: TextView = itemView.findViewById(R.id.productTitle)
        val productPrice: TextView = itemView.findViewById(R.id.productPrice)

        fun bindProduct(product: Product) {
            val resId =
                context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage.setImageResource(resId)
            productTitle.text = product.title
            productPrice.text = product.price
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindProduct(productList[position])
    }
}