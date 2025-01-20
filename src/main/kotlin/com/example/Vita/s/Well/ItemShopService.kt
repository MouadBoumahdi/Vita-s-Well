package com.example.Vita.s.Well

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ItemShopService(@Autowired private val itemShopRepository: ItemShopRepository) {

    fun getAllItems(): List<ItemShop> = itemShopRepository.findAll()

    fun getItemById(id: Int): ItemShop = itemShopRepository.findById(id)
        .orElseThrow { RuntimeException("Item not found with id: $id") }

    fun createItem(itemShop: ItemShop): ItemShop = itemShopRepository.save(itemShop)

    fun updateItem(id: Int, itemShopDetails: ItemShop): ItemShop {
        val item = getItemById(id)
        item.apply {
            title = itemShopDetails.title
            price = itemShopDetails.price
            rating = itemShopDetails.rating
            imageResId = itemShopDetails.imageResId
            buttonResId = itemShopDetails.buttonResId
            description = itemShopDetails.description
            quantity = itemShopDetails.quantity
            isfavorite = itemShopDetails.isfavorite
        }
        return itemShopRepository.save(item)
    }

    fun deleteItem(id: Int) {
        val item = getItemById(id)
        itemShopRepository.delete(item)
    }
}
