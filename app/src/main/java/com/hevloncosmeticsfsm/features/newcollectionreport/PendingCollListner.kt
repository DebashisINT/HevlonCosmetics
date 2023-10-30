package com.hevloncosmeticsfsm.features.newcollectionreport

import com.hevloncosmeticsfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}