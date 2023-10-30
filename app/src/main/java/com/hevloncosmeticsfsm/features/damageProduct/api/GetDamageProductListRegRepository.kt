package com.hevloncosmeticsfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.hevloncosmeticsfsm.app.FileUtils
import com.hevloncosmeticsfsm.base.BaseResponse
import com.hevloncosmeticsfsm.features.NewQuotation.model.*
import com.hevloncosmeticsfsm.features.addshop.model.AddShopRequestData
import com.hevloncosmeticsfsm.features.addshop.model.AddShopResponse
import com.hevloncosmeticsfsm.features.damageProduct.model.DamageProductResponseModel
import com.hevloncosmeticsfsm.features.damageProduct.model.delBreakageReq
import com.hevloncosmeticsfsm.features.damageProduct.model.viewAllBreakageReq
import com.hevloncosmeticsfsm.features.login.model.userconfig.UserConfigResponseModel
import com.hevloncosmeticsfsm.features.myjobs.model.WIPImageSubmit
import com.hevloncosmeticsfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}