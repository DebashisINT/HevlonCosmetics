package com.hevloncosmeticsfsm.features.photoReg.adapter

import com.hevloncosmeticsfsm.features.photoReg.model.ProsCustom
import com.hevloncosmeticsfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}