package com.hevloncosmeticsfsm.features.orderhistory.model

import com.hevloncosmeticsfsm.base.BaseResponse

/**
 * Created by Pratishruti on 30-11-2017.
 */
class FetchLocationResponse:BaseResponse(){
    var location_details:List<LocationData>?=null
    var visit_distance = ""
}