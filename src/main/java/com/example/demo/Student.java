package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {


    @SequenceGenerator(name="studentIdGenerator", allocationSize=1)
    @Id
    @GeneratedValue(
            strategy=GenerationType.SEQUENCE,
            generator="studentIdGenerator"
    )
    private Long id;

    private String name;
    private int age;

    public Student() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
