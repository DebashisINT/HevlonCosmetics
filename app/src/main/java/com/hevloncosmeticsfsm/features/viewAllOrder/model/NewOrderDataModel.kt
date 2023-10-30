package com.hevloncosmeticsfsm.features.viewAllOrder.model

import com.hevloncosmeticsfsm.app.domain.NewOrderColorEntity
import com.hevloncosmeticsfsm.app.domain.NewOrderGenderEntity
import com.hevloncosmeticsfsm.app.domain.NewOrderProductEntity
import com.hevloncosmeticsfsm.app.domain.NewOrderSizeEntity
import com.hevloncosmeticsfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

