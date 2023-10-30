package com.hevloncosmeticsfsm.features.login.model.productlistmodel

import com.hevloncosmeticsfsm.app.domain.ModelEntity
import com.hevloncosmeticsfsm.app.domain.ProductListEntity
import com.hevloncosmeticsfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}