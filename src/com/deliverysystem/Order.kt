package com.deliverysystem

data class Order(
    val orderId: String,
    val customer: Customer,
    val items: List<Item>,
    var status: String,
    val deliveryAddress: String
) {
    fun getDetails(): String {
        return "Order ID: $orderId, Customer: ${customer.name}, Status: $status"
    }

    fun updateStatus(newStatus: String) {
        status = newStatus
    }
}