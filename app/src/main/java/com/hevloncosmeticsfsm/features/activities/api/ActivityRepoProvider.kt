package com.hevloncosmeticsfsm.features.activities.api

import com.hevloncosmeticsfsm.features.member.api.TeamApi
import com.hevloncosmeticsfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}