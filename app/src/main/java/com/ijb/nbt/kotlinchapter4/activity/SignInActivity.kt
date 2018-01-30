package com.ijb.nbt.kotlinchapter4.activity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.ijb.nbt.firstkotlinproj.data.UserProfile
import com.ijb.nbt.firstkotlinproj.helper.validateWith
import com.ijb.nbt.kotlinchapter4.R
import com.ijb.nbt.kotlinchapter4.widget.TextWatcherAdapter
import kotlinx.android.synthetic.main.activity_signin.*

// TODO : override
class SignInActivity : BaseActivity() {

    private lateinit var userProfile: UserProfile
    private lateinit var mUserNameEditText: EditText
    private lateinit var mUserEmailEditText: EditText
    private lateinit var mSubmitButton: Button

    private var mEntryValid = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        init()
    }

    override fun init() {
        mUserNameEditText = edit_text_name
        mUserEmailEditText = edit_text_email
        mSubmitButton = submit_button

        /**
         * object : singleton 객체 정의 외에도 무명 객체를 정의할 때도 사용됨
         * 무명 객체는 자바의 무명 내부 클래스를 말함
         *
         * by : 클래스 위임. 상속을 허용하지 않는 클래스에 새로운 동작을 추가할 때 유용
         * 일부 동작을 변경하고 싶은 메서드만 override
         */
        val textWatcher = object : TextWatcher by TextWatcherAdapter {

            override fun afterTextChanged(editable: Editable) {

                val notEmpty: TextView.() -> Boolean = { text.isNotEmpty() }
                val isEmail: TextView.() -> Boolean = { Patterns.EMAIL_ADDRESS.matcher(text).matches() }
                // 확장함수 사용
                mEntryValid = mUserNameEditText.validateWith(validator = notEmpty) and
                        mUserEmailEditText.validateWith(validator = notEmpty) and
                        mUserEmailEditText.validateWith(validator = isEmail)
            }
        }

        mUserNameEditText.addTextChangedListener(textWatcher)
        mUserEmailEditText.addTextChangedListener(textWatcher)
        mSubmitButton.setOnClickListener{
            // TODO : it 키워드 사용해보기, it.setBackgroundColor() 등

            // TODO
            if (mEntryValid) {
                // UserProfile 저장

            } else {
                Toast.makeText(this@SignInActivity,
                        "사용자 정보를 다시 입력해주세요",
                        Toast.LENGTH_SHORT).show()
            }

        }
    }
}
