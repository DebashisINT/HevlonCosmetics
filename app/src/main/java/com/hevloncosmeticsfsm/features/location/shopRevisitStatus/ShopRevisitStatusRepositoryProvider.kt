package com.hevloncosmeticsfsm.features.location.shopRevisitStatus

import com.hevloncosmeticsfsm.features.location.shopdurationapi.ShopDurationApi
import com.hevloncosmeticsfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}