package com.hevloncosmeticsfsm.features.stockCompetetorStock.api

import com.hevloncosmeticsfsm.base.BaseResponse
import com.hevloncosmeticsfsm.features.orderList.model.NewOrderListResponseModel
import com.hevloncosmeticsfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.hevloncosmeticsfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}