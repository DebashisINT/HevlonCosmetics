package com.hevloncosmeticsfsm.features.viewAllOrder.interf

import com.hevloncosmeticsfsm.features.viewAllOrder.model.ProductOrder

interface EmptyProductOnClick {
    fun emptyProductOnCLick(emptyFound:Boolean)
    fun delProductOnCLick(isDel:Boolean)
}