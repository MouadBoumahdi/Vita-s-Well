package com.example.Vita.s.Well

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/items")
class ItemShopController(@Autowired private val itemShopService: ItemShopService) {

    @GetMapping
    fun getAllItems(): List<ItemShop> = itemShopService.getAllItems()

    @GetMapping("/{id}")
    fun getItemById(@PathVariable id: Int): ItemShop = itemShopService.getItemById(id)

    @PostMapping
    fun createItem(@RequestBody itemShop: ItemShop): ItemShop = itemShopService.createItem(itemShop)

    @PutMapping("/{id}")
    fun updateItem(@PathVariable id: Int, @RequestBody itemShopDetails: ItemShop): ItemShop =
        itemShopService.updateItem(id, itemShopDetails)

    @DeleteMapping("/{id}")
    fun deleteItem(@PathVariable id: Int) = itemShopService.deleteItem(id)
}
