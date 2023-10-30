package com.hevloncosmeticsfsm.features.dashboard.presentation.api.dayStartEnd

import com.hevloncosmeticsfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.hevloncosmeticsfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}