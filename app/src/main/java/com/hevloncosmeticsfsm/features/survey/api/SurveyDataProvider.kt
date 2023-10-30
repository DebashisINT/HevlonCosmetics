package com.hevloncosmeticsfsm.features.survey.api

import com.hevloncosmeticsfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.hevloncosmeticsfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}