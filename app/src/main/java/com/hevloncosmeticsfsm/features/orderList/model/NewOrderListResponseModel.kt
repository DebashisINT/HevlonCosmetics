package com.hevloncosmeticsfsm.features.orderList.model

import com.hevloncosmeticsfsm.base.BaseResponse

/**
 * Created by Saikat on 03-12-2018.
 */
class NewOrderListResponseModel : BaseResponse() {
    var order_list: ArrayList<NewOrderListDataModel>? = null
}