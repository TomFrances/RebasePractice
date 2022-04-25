package com.example.demo.student;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
@Builder
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tom = Student.builder()
                    .id(1)
                    .name("Tom")
                    .age(25)
                    .birth(LocalDate.of(1997, 1, 1))
                    .email("monmail")
                    .build();
            Student nico = Student.builder()
                    .id(2)
                    .name("Nico")
                    .age(23)
                    .birth(LocalDate.of(1998, 11, 27))
                    .email("sonmail")
                    .build();
            repository.saveAll(List.of(tom, nico));

        };
    }
}
