package com.example.ptloc.databinding_kotlin.model

import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import com.example.ptloc.databinding_kotlin.LoginValidator
import com.example.ptloc.databinding_kotlin.TextChange

open class UserViewModel(user: User) {
    var email: String
    var password: String
    var imageUrl: String
    var firstNameError = ObservableField<String>()
    var passwordError = ObservableField<String>()
    var loginValidator = LoginValidator()
    var isValid = ObservableBoolean()

    init {
        this.email = user.email
        this.password = user.password
        this.imageUrl = user.imageUrl
    }

    var emailChange: TextChange = TextChange { value ->
        email = value!!
        firstNameError.set(loginValidator.isValidEmail(email))
        updateBtnState()
    }

    var passwordChange: TextChange = TextChange { value ->
        password = value
        passwordError.set(loginValidator.isValidPassword(password))
        updateBtnState()
    }

    private fun updateBtnState() {
        isValid.set(!hasEmptyData() && !hasError())
    }

    private fun hasEmptyData(): Boolean {
        return email.equals("") || !password.equals("")
    }

    private fun hasError(): Boolean {
        return firstNameError.get() != null && passwordError.get() != null
    }
}
