package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@RequestMapping(path = "api/v1/student")
@RestController

public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                    new Student(
                        1L,
                        "Mariam",
                        "magiam.jama@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                    )
                ); 
    }
     
}

