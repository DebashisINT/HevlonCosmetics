package com.hevloncosmeticsfsm.features.viewAllOrder.orderOptimized

import com.hevloncosmeticsfsm.app.domain.ProductOnlineRateTempEntity
import com.hevloncosmeticsfsm.base.BaseResponse
import com.hevloncosmeticsfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}