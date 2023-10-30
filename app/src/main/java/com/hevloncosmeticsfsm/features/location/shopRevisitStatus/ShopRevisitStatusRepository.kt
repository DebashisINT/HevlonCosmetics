package com.hevloncosmeticsfsm.features.location.shopRevisitStatus

import com.hevloncosmeticsfsm.base.BaseResponse
import com.hevloncosmeticsfsm.features.location.model.ShopDurationRequest
import com.hevloncosmeticsfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}