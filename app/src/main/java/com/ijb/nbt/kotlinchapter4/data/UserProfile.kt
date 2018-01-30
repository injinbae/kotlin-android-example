package com.ijb.nbt.firstkotlinproj.data

/**
 * Created by bae injin on 2018. 1. 28..
 */
data class UserProfile(val name: String?, val email: String?) {

    fun valid() = !name.isNullOrEmpty() && !email.isNullOrEmpty()

    // TODO : data class 구현
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}