package com.hevloncosmeticsfsm.features.login.model.productlistmodel

import com.hevloncosmeticsfsm.app.domain.NewOrderScrOrderEntity
import com.hevloncosmeticsfsm.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}