package com.hevloncosmeticsfsm.features.weather.api

import com.hevloncosmeticsfsm.features.task.api.TaskApi
import com.hevloncosmeticsfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}