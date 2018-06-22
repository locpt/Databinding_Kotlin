package com.example.ptloc.databinding_kotlin

import android.text.TextUtils
import android.util.Patterns

class LoginValidator {

    fun isValidEmail(email: String): String {
        return if (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()) "email is valid" else "email is not valid"
    }

    fun isValidPassword(password: String): String {
        return if (password.length > 4) "password is valid" else "password is not valid"
    }
}
