package com.ijb.nbt.firstkotlinproj.data

/**
 * primary constructor에는 코드 포함 불가, 초기화 코드는 init block으로 시작
 * primary constructor : class 정의와 동시에, class name 바로 뒤에 선언 , constructor keyword 생략 가능
 */

open class Ad constructor(val adId: Int) {

    var adType: Int = AD_CPC
    constructor(adId: Int, adType: Int) : this(adId) {
        this.adType = adType
    }

    companion object {
        private const val AD_CPC = 0
        private const val AD_CPI = 1
    }

    protected fun updateAdId(adId: String) = println("update Ad ID")
}
