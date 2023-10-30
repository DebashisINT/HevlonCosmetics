package com.hevloncosmeticsfsm.features.alarm.model

import com.hevloncosmeticsfsm.base.BaseResponse

/**
 * Created by Kinsuk on 20-02-2019.
 */
class AttendanceReportDataModel : BaseResponse() {
    var attendance_report_list: ArrayList<AttendanceReport>? = null
}