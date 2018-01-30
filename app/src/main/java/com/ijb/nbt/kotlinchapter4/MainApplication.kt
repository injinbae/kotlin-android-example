package com.ijb.nbt.firstkotlinproj

import android.support.multidex.MultiDexApplication
import android.content.Context

/**
 * Created by bae injin on 2018. 1. 29..
 */
class MainApplication : MultiDexApplication() {

    init {
        instance = this
    }

    /**
     * 동반 객체 : 일반 객체처럼 사용하는 경우
     * MainApplication.applicationContext 로 호출
     */
    companion object {
        private var instance: MainApplication? = null
        fun applicationContext(): Context {
            return instance!!.applicationContext
        }
    }

    //TODO : 동반 객체에서 인터페이스 구현
}