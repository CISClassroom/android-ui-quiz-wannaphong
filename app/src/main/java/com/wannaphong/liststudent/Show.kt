package com.wannaphong.liststudent

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show.*

class Show : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        val i:Int= intent.getIntExtra("i",0)
        val res: Resources = resources
        ///var name:String = res.getStringArray(R.array.students60)[i]
        //var id = res.getStringArray(R.array.student60_id)[i]
        name.text = res.getStringArray(R.array.students60)[i]
        id.text = res.getStringArray(R.array.student60_id)[i]
        if("นาย" in res.getStringArray(R.array.students60)[i]){
            img.setImageDrawable(getDrawable(R.drawable.m))
        }
        else{
            img.setImageDrawable(getDrawable(R.drawable.w))
        }
    }
}
