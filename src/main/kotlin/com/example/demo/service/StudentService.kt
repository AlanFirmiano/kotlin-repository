package com.example.demo.service

import com.example.demo.model.Student
import com.example.demo.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService @Autowired constructor(private val studentRepository: StudentRepository) {

    fun save(student: Student) = studentRepository.save(student)

    fun get(id: Int): Student = studentRepository.findById(id).get()

    fun get(): List<Student> = studentRepository.findAll()

    fun delete(id: Int) = studentRepository.deleteById(id)

    fun update(student: Student):Student = studentRepository.save(student)

}