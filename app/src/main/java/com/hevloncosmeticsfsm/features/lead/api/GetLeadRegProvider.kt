package com.hevloncosmeticsfsm.features.lead.api

import com.hevloncosmeticsfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.hevloncosmeticsfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}