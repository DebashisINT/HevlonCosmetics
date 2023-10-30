package com.hevloncosmeticsfsm.features.document.api

import com.hevloncosmeticsfsm.features.dymanicSection.api.DynamicApi
import com.hevloncosmeticsfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}