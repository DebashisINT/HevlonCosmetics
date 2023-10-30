package com.hevloncosmeticsfsm.features.task.api

import com.hevloncosmeticsfsm.features.timesheet.api.TimeSheetApi
import com.hevloncosmeticsfsm.features.timesheet.api.TimeSheetRepo

/**
 * Created by Saikat on 12-Aug-20.
 */
object TaskRepoProvider {
    fun taskRepoProvider(): TaskRepo {
        return TaskRepo(TaskApi.create())
    }
}