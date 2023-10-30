package com.hevloncosmeticsfsm.features.photoReg.present

import com.hevloncosmeticsfsm.app.domain.ProspectEntity
import com.hevloncosmeticsfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}