package com.example.Vita.s.Well

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemShopRepository : JpaRepository<ItemShop, Int> {
}