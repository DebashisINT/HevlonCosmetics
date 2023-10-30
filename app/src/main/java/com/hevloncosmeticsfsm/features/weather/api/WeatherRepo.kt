package com.hevloncosmeticsfsm.features.weather.api

import com.hevloncosmeticsfsm.base.BaseResponse
import com.hevloncosmeticsfsm.features.task.api.TaskApi
import com.hevloncosmeticsfsm.features.task.model.AddTaskInputModel
import com.hevloncosmeticsfsm.features.weather.model.ForeCastAPIResponse
import com.hevloncosmeticsfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}