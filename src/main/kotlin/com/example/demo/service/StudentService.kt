package com.example.demo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {

    fun sum(num1: Double, num2: Double) : Double = num1 + num2

    fun sub(num1: Double, num2: Double) : Double = num1 - num2

}