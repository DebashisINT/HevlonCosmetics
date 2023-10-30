package com.hevloncosmeticsfsm.features.orderhistory.activitiesapi

import com.hevloncosmeticsfsm.app.Pref
import com.hevloncosmeticsfsm.base.BaseResponse
import com.hevloncosmeticsfsm.features.orderhistory.model.FetchLocationRequest
import com.hevloncosmeticsfsm.features.orderhistory.model.FetchLocationResponse
import com.hevloncosmeticsfsm.features.orderhistory.model.SubmitLocationInputModel
import com.hevloncosmeticsfsm.features.orderhistory.model.UnknownReponseModel
import io.reactivex.Observable

/**
 * Created by Pratishruti on 30-11-2017.
 */
class LocationFetchRepository(val apiService: LocationFetchApi){
    fun fetchLocationUpdate(location: FetchLocationRequest): Observable<FetchLocationResponse> {
        return apiService.getLocationUpdates(location)
    }

    fun fetchLocationUpdate(date: String): Observable<FetchLocationResponse> {
        return apiService.getLocationUpdates(Pref.session_token!!, Pref.user_id!!, date)
    }

    fun fetchUnknownLocation(): Observable<UnknownReponseModel> {
        return apiService.getUnknownLocation(Pref.session_token!!, Pref.user_id!!)
    }

    fun submitLoc(loc: SubmitLocationInputModel): Observable<BaseResponse> {
        return apiService.submitLocation(loc)
    }
}