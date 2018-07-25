package com.example.demo.service

import com.example.demo.model.Student
import com.example.demo.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService @Autowired constructor(private val studentRepository: StudentRepository) {

    val listaStudents = listOf("Gley", "Leo", "Alan", "Gabriel")

    fun mostrar(): List<String> {
        var safe:Int? = null //safe call operator
        val bomHumor = false
        println("Hoje estou ${ if (bomHumor) "feliz" else "triste"} \nsafe : ${safe?: "sucesso"}") //elvis operator

        return listaStudents.sorted()
    }

    fun save(student: Student):String {
        studentRepository.save(student)
        return "Sucess!"
    }
    fun get(id: Int): Student = studentRepository.findById(id).get()

    fun get(): List<Student> = studentRepository.findAll()

    fun delete(id: Int):String{
        studentRepository.deleteById(id)
        return "Sucess!"
    }

    fun update(student: Student):String {
        studentRepository.save(student)
        return "Sucess!"
    }

    fun sum(num1: Double, num2: Double ): Double = num1 + num2

    fun sub(num1: Double, num2: Double ): Double = num1 - num2
}