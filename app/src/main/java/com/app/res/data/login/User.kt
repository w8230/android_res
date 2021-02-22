package com.app.res.data.login

import android.os.Parcelable
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

/**
* User data class
* @author 김재일 <Jerry Kim>
* @version 1.0.0
* @since 2021년 02월 22일 7:49 PM
**/
@Parcelize
data class User(
        var user_code: String? = null,
        var user_id: String? = null,
        var user_pwd: String? = null,
        var user_name: String? = null,
        var user_status: String? = null,
        var acc_status: String? = null,
        var kakao_status: String? = null,
        var kakao_user_code: String? = null,
        var google_user_code: String? = null,
        var push_ok: String? = null,
        var mark_ok: String? = null,
        var sms_ok: String? = null,
        var create_date: String? = null,
        var update_date: String? = null,
        var login_date: String? = null,
        var profile: String? = null
) : Parcelable