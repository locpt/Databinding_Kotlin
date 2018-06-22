package com.example.ptloc.databinding_kotlin

import android.databinding.BindingAdapter
import android.widget.EditText
import android.widget.ImageView

import com.bumptech.glide.Glide

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String) {
    Glide.with(view.context).load(url).into(view)
}

@BindingAdapter("firstNameChange")
fun firstNameChange(editText: EditText, textChange: TextChange) {
    editText.addTextChangedListener(object : TextChangeAdapter() {
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            textChange.onChange(s.toString())
        }
    })
}

@BindingAdapter("passwordChange")
fun passwordChange(editText: EditText, textChange: TextChange) {
    editText.addTextChangedListener(object : TextChangeAdapter() {
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            textChange.onChange(s.toString())
        }
    })
}
