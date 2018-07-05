package com.example.demo.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Student(
        @Id var id : Int,
        var name : String,
        var course : String,
        var age : Int)