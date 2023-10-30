package com.hevloncosmeticsfsm.features.viewAllOrder.interf

import com.hevloncosmeticsfsm.app.domain.NewOrderColorEntity
import com.hevloncosmeticsfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}