package com.hevloncosmeticsfsm.features.myjobs.api

import android.content.Context
import android.net.Uri
import android.util.Log
import com.hevloncosmeticsfsm.app.FileUtils
import com.hevloncosmeticsfsm.base.BaseResponse
import com.hevloncosmeticsfsm.features.activities.model.ActivityImage
import com.hevloncosmeticsfsm.features.activities.model.AddActivityInputModel
import com.hevloncosmeticsfsm.features.myjobs.model.WIPSubmit
import com.fasterxml.jackson.databind.ObjectMapper
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

object MyJobRepoProvider {
    fun jobRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.create())
    }

    fun jobMultipartRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.createMultiPart())
    }

}