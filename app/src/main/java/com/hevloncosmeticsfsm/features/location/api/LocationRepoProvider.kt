package com.hevloncosmeticsfsm.features.location.api

import com.hevloncosmeticsfsm.features.location.shopdurationapi.ShopDurationApi
import com.hevloncosmeticsfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}