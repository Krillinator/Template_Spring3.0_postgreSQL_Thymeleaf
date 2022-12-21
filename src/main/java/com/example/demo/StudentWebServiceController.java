package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentWebServiceController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentWebServiceController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @GetMapping("/student/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable Long id) {


        System.out.println(studentRepository.findStudentById(id));

        if (studentRepository.findStudentById(id) != null) {
            return new ResponseEntity<>(  studentRepository.findStudentById(id) , HttpStatus.OK);
        }

        return new ResponseEntity<>( null , HttpStatus.NOT_FOUND);

    }

    @PostMapping("/student")
    public ResponseEntity<Student> postStudent(@RequestBody final Student student) {

        if (student != null) {
            studentRepository.save(student);
            return new ResponseEntity<>(student, HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

    }

}
