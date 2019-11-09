package dharmesh.padhiyar.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dharmesh.padhiyar.coderswag.Model.Category
import dharmesh.padhiyar.coderswag.R

class CategoryRecyclerAdapter(val context: Context, val list: List<Category>) :
    RecyclerView.Adapter<CategoryRecyclerAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_row, parent, false))
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.categoryImage)
        val title: TextView = itemView.findViewById(R.id.categoryName)

        fun bindCategory(category: Category, context: Context) {
            val resId =
                context.resources.getIdentifier(category.image, "drawable", context.packageName)
            image.setImageResource(resId)
            title.text = category.title
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = list[position]
        holder.bindCategory(category, context)
    }
}