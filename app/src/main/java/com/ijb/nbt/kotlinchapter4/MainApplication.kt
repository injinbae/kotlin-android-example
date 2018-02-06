package com.ijb.nbt.firstkotlinproj

import android.content.Context
import android.support.multidex.MultiDexApplication

/**
 * Created by bae injin on 2018. 1. 29..
 */
class MainApplication : MultiDexApplication() {

    init {
        instance = this
    }

    /**
     * 동반 객체 : 일반 객체처럼 사용하는 경우.
     * 동반 객체 안에 확장 함수와 프로퍼티를 정의할 수 있다.
     */
    companion object Ctx {
        private var instance: MainApplication? = null
        fun applicationContext(): Context {
            return instance!!.applicationContext
        }
    }

    //TODO : 동반 객체에서 인터페이스 구현
}