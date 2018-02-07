package com.ijb.nbt.kotlinchapter4

/**
 * 접근 불가
 */
//fun topFun(a: A) {
//    a.doStuff()
//}

class Page186 {
    private fun doSomething() = true

    object Test {
        fun done(a: Page186) = a.doSomething()
    }
}