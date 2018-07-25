package com.example.demo.controller

import com.example.demo.model.Student
import com.example.demo.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/student")
class StudentController @Autowired constructor(private val studentService: StudentService){

    @GetMapping
    fun get():ResponseEntity<List<Student>> = ResponseEntity.ok(studentService.get())

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Int): ResponseEntity<Student> = ResponseEntity.ok(studentService.get(id))

    @PostMapping
    fun save(@RequestBody student: Student): ResponseEntity<String> = ResponseEntity.ok(studentService.save(student))

    @PutMapping
    fun update(@RequestBody student: Student) = studentService.update(student)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Int) = studentService.delete(id)

    @GetMapping("/mostrar")
    fun mostrar():ResponseEntity<List<String>> = ResponseEntity.ok(studentService.mostrar())

    @GetMapping("/calc/sum/{num1}/{num2}")
    fun sum(@PathVariable("num1") num1:Double, @PathVariable("num2") num2:Double) :
            String = "Resultado : ${studentService.sum(num1, num2)}"

    @GetMapping("/calc/sub/{num1}/{num2}")
    fun sub(@PathVariable("num1") num1:Double, @PathVariable("num2") num2:Double) :
            String = "Resultado : ${studentService.sub(num1, num2)}"

}

