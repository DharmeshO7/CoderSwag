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
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$38", "hat02"),
        Product("Devslopes Hat White", "$68", "hat03"),
        Product("Devslopes Hat Snapback", "$28", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "$18", "hoodie01"),
        Product("Devslopes Hoodie Black", "$38", "hoodie02"),
        Product("Devslopes Grey Hoodie", "$68", "hoodie03"),
        Product("Devslopes Black Hoddie", "$28", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Black Shirt", "$18", "shirt01"),
        Product("Devslopes Red Shirt", "$38", "shirt02"),
        Product("Devslopes Chex Shirt", "$68", "shirt03"),
        Product("Devslopes Purple Shirt", "$28", "shirt04"),
        Product("Devslopes Woolen Shirt", "$28", "shirt05")
    )
}