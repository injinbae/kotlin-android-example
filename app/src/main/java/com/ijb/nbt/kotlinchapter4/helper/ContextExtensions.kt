package com.ijb.nbt.kotlinchapter4.helper

import android.annotation.SuppressLint
import android.content.Context
import com.ijb.nbt.kotlinchapter4.data.UserProfile

// TODO : Data 저장 등 확장함수 구현
const val USERPROFILE_PREFERENCES = "userProfilePreferences"
const val PREFERENCE_USER_NAME = "$USERPROFILE_PREFERENCES.name"
const val PREFERENCE_USER_EMAIL = "$USERPROFILE_PREFERENCES.email"

@SuppressLint("CommitPrefEdits")
private fun Context.editUserProfile() = getUserProfilePreference().edit()

private fun Context.getUserProfilePreference() =
        getSharedPreferences(USERPROFILE_PREFERENCES, Context.MODE_PRIVATE)

fun Context.getUserProfile() = with(getUserProfilePreference()) {
    UserProfile(getString(PREFERENCE_USER_NAME, null),
            getString(PREFERENCE_USER_EMAIL, null))

}

fun Context.saveUserProfile(userProfile: UserProfile) {
    with(userProfile) {
        if(valid())
            editUserProfile()
                    .putString(PREFERENCE_USER_NAME, name)
                    .putString(PREFERENCE_USER_EMAIL, email)
                    .apply()
    }
}