package com.wannaphong.liststudent

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.wannaphong.liststudent.Adapter.StudentAdapter
import com.wannaphong.liststudent.Model.Student

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var student:MutableList<Student> = mutableListOf<Student>()
        val res: Resources = resources
        var students60 = res.getStringArray(R.array.students60)
        var students60id = res.getStringArray(R.array.student60_id)
        var i =0
        while (i<students60.size){
            if ("นาย" in students60[i]){
                student.add(Student(students60[i], students60id[i], R.drawable.m))
            }
            else{
                student.add(Student(students60[i], students60id[i], R.drawable.w))
            }
            i = i+1
        }

        var listview: ListView = findViewById(R.id.itemlist)

        listview.adapter = StudentAdapter(
            this,
            R.layout.activity_list_student,
            student
        )
    }
}
