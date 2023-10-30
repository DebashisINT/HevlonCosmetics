package com.hevloncosmeticsfsm.features.orderList.model

import com.hevloncosmeticsfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}