package com.example.Vita.s.Well

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class ItemShop(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var title: String,
    var price: String,
    var rating: String,
    var imageResId: Int,
    var buttonResId: Int,
    var description: String,
    var quantity: Int,
    var isfavorite: Boolean = false
)


