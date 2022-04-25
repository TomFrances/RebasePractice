package com.example.demo.student;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Students")
public class Student {
    @Id
    private long id;
    private String name;
    private int age;
    private LocalDate birth;
    private String email;


    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", email='" + email + '\'' +
                '}';
    }
}
