package com.ijb.nbt.kotlinchapter4.data

data class UserProfile(val name: String?, val email: String?) {
    fun valid() = !name.isNullOrEmpty() && !email.isNullOrEmpty()
}

data class UserProfileList(val name: String, val email: String,
                           val dailyNewUser: List<UserProfile>) {

    /**
     * custom getter
     */
    val size: Int
        get() = dailyNewUser.size

    operator fun get(position: Int) = dailyNewUser[position]
}