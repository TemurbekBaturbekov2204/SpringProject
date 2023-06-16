package com.example.demoSpringProject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                         Student mary=new Student(
                            1L,
                            "Mary",
                            "Mary@gmail.com",
                            LocalDate.of(2000, Month.JANUARY,8),
                            23
                         );
            Student alex=new Student(
                    2L,
                    "Aley",
                    "Aleyy@gmail.com",
                    LocalDate.of(2001, Month.JANUARY,10),
                    22
            );
                         repository.saveAll(List.of(mary,alex));
        };
    }
}
