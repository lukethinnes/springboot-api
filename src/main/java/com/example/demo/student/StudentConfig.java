package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
          Student mariam = new Student(
                "Mariam",
                "mariam.jama@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21
            );

          Student jason = new Student(
                "Jason",
                "jason.vorhees@gmail.com",
                LocalDate.of(1988, Month.APRIL, 14),
                33 
            );

          repository.saveAll(List.of(mariam, jason)
            );
        };
    }
}

