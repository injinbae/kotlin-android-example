package com.ijb.nbt.firstkotlinproj.data

/**
 * Created by bae injin on 2018. 1. 28..
 */
class CostPerActionAd : Ad {

    /**
     * 상위 클래스의 생성자에 객체 생성 위임
     * secondary constructor가 필요한 주된 이유 : 자바 상호운용성
     */
    constructor(adId: Int) : super(adId = adId)
    constructor(adId: Int, adType: Int) : super(adId = adId, adType = adType)

}