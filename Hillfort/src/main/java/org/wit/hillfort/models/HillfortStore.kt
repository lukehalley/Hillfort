package org.wit.hillfort.models

interface HillfortStore {
    fun findAll(): List<HillfortModel>
    fun create(hillfort: HillfortModel)
    fun update(hillfort: HillfortModel)
    fun delete(hillfort: HillfortModel)
    fun clear()
}// Interface for managing hillfort data storage and retrieval
// Central repository for hillfort data operations
// Initialize store with default data
