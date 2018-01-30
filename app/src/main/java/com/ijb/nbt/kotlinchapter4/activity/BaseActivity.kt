package com.ijb.nbt.kotlinchapter4.activity

import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by bae injin on 2018. 1. 30..
 */

// TODO : 추상 클래스
abstract class BaseActivity : AppCompatActivity() {
    /**
     * 비추상 함수는 기본적으로 final
     */
    fun showError(error: String?) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }

    fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    /**
     * override 허용 : open
     */
    open fun loadTargetUrl(url: String) : String? {
        return null
    }

    protected abstract fun init()

}