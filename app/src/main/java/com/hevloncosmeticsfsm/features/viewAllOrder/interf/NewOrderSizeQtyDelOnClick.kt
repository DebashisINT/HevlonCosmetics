package com.hevloncosmeticsfsm.features.viewAllOrder.interf

import com.hevloncosmeticsfsm.app.domain.NewOrderGenderEntity
import com.hevloncosmeticsfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}