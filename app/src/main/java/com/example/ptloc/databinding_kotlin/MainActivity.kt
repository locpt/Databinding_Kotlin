package com.example.ptloc.databinding_kotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ptloc.databinding_kotlin.databinding.ActivityMainBinding
import com.example.ptloc.databinding_kotlin.model.User
import com.example.ptloc.databinding_kotlin.model.UserViewModel

class MainActivity : AppCompatActivity(), MyInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val user = User("Thanh Loc", " Phan", "https://znews-photo-td.zadn.vn/w1024/Uploaded/oqivovbt/2018_03_04/vu_zing_1.jpg")
        binding.userVM = UserViewModel(user)

    }

}
