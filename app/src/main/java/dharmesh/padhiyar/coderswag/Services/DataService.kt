package dharmesh.padhiyar.coderswag.Services

import dharmesh.padhiyar.coderswag.Model.Category
import dharmesh.padhiyar.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$38", "hat2"),
        Product("Devslopes Hat White", "$68", "hat3"),
        Product("Devslopes Hat Snapback", "$28", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$38", "hat2"),
        Product("Devslopes Hat White", "$68", "hat3"),
        Product("Devslopes Hat Snapback", "$28", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$38", "hat2"),
        Product("Devslopes Hat White", "$68", "hat3"),
        Product("Devslopes Hat Snapback", "$28", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "$18", "hoodie1"),
        Product("Devslopes Hoodie Black", "$38", "hoodie2"),
        Product("Devslopes Grey Hoodie", "$68", "hoodie3"),
        Product("Devslopes Black Hoddie", "$28", "hoodie4"),
        Product("Devslopes Hoodie Grey", "$18", "hoodie1"),
        Product("Devslopes Hoodie Black", "$38", "hoodie2"),
        Product("Devslopes Grey Hoodie", "$68", "hoodie3"),
        Product("Devslopes Black Hoddie", "$28", "hoodie4"),
        Product("Devslopes Hoodie Grey", "$18", "hoodie1"),
        Product("Devslopes Hoodie Black", "$38", "hoodie2"),
        Product("Devslopes Grey Hoodie", "$68", "hoodie3"),
        Product("Devslopes Black Hoddie", "$28", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Black Shirt", "$18", "shirt1"),
        Product("Devslopes Red Shirt", "$38", "shirt2"),
        Product("Devslopes Chex Shirt", "$68", "shirt3"),
        Product("Devslopes Purple Shirt", "$28", "shirt4"),
        Product("Devslopes Woolen Shirt", "$28", "shirt5"),
        Product("Devslopes Black Shirt", "$18", "shirt1"),
        Product("Devslopes Red Shirt", "$38", "shirt2"),
        Product("Devslopes Chex Shirt", "$68", "shirt3"),
        Product("Devslopes Purple Shirt", "$28", "shirt4"),
        Product("Devslopes Woolen Shirt", "$28", "shirt5"),
        Product("Devslopes Black Shirt", "$18", "shirt1"),
        Product("Devslopes Red Shirt", "$38", "shirt2"),
        Product("Devslopes Chex Shirt", "$68", "shirt3"),
        Product("Devslopes Purple Shirt", "$28", "shirt4"),
        Product("Devslopes Woolen Shirt", "$28", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGood
        }
    }
}