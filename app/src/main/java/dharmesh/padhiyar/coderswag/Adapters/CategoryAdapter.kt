package dharmesh.padhiyar.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import dharmesh.padhiyar.coderswag.Model.Category
import dharmesh.padhiyar.coderswag.R

class CategoryAdapter(var context: Context, var categories: List<Category>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.list_row, null)
            holder = ViewHolder()

            holder.image = categoryView.findViewById(R.id.categoryImage)
            holder.title = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]
        val resId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        holder.image?.setImageResource(resId)
        holder.title?.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var image: ImageView? = null
        var title: TextView? = null
    }
}