package com.nightshell.anko

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RelativeLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        relativeLayout{
            var times = 0
            editText{
                id = 1
                hint = "name"
                textSize = 24f
            }.lparams{
                alignParentTop()
                alignLeftAndRight()
            }
            editText{
                id = 2
                hint = "age"
            }.lparams {
                below(1)
                alignParentLeft()
                leftOf(3)
            }
            button ("Set"){
                id = 3
                onClick {
                    toast("Clicked ${++times} times")
                }
            }.lparams {
                below(1)
                alignParentRight()
            }
        }
    }

    private fun RelativeLayout.LayoutParams.alignLeftAndRight() {
        alignParentLeft()
        alignParentRight()
    }
}
