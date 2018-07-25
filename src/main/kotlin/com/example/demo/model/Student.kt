package com.example.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Student(
        @Id
        @GeneratedValue
        var id : Int=0,
        var name : String="",
        var course : String="",
        var age : Int=1)