package com.example.demo.controller

import com.example.demo.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class StudentController @Autowired constructor(private val studentService: StudentService){

    @GetMapping
    fun index():String = "Hello World"

    @GetMapping("/calc/sum")
    fun sum(@RequestParam("num1") num1:Double, @RequestParam("num2") num2:Double) :
            String = "Resultado : ${studentService.sum(num1, num2)}"

    @GetMapping("/calc/sub")
    fun sub(@RequestParam("num1") num1:Double, @RequestParam("num2") num2:Double) :
            String = "Resultado : ${studentService.sub(num1, num2)}"

}