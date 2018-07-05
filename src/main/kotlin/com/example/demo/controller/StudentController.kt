package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class StudentController{

    @GetMapping
    fun index():String = "Hello World"

    @GetMapping("/calc")
    fun calc(@RequestParam("num1") num1:Int, @RequestParam("num2") num2:Int) : String = "Resultado : ${num1+num2}"


}