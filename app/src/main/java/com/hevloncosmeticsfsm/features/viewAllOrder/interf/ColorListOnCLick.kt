package com.hevloncosmeticsfsm.features.viewAllOrder.interf

import com.hevloncosmeticsfsm.app.domain.NewOrderGenderEntity
import com.hevloncosmeticsfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}