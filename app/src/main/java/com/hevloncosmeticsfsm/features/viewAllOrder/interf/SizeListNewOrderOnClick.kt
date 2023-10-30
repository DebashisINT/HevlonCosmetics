package com.hevloncosmeticsfsm.features.viewAllOrder.interf

import com.hevloncosmeticsfsm.app.domain.NewOrderProductEntity
import com.hevloncosmeticsfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}