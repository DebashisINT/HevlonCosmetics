package com.hevloncosmeticsfsm.features.dashboard.presentation.getcontentlisapi

/**
 * Created by Saikat on 05-03-2019.
 */
object GetContentListRepoProvider {
    fun getContentListRepoProvider(): GetContentListRepo {
        return GetContentListRepo(GetContentListApi.create())
    }
}