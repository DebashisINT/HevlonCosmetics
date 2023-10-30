package com.hevloncosmeticsfsm.features.stockAddCurrentStock.api

import com.hevloncosmeticsfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.hevloncosmeticsfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}