package com.hevloncosmeticsfsm.features.nearbyuserlist.api

import com.hevloncosmeticsfsm.app.Pref
import com.hevloncosmeticsfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.hevloncosmeticsfsm.features.newcollection.model.NewCollectionListResponseModel
import com.hevloncosmeticsfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}