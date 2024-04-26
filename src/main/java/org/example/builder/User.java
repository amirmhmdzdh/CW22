package org.example.builder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String fatherName;

    private int age;

    private LocalDate birthDate;

    private String job;

    private boolean isMarried;

    private String address;

    private String userName;

    private String password;


    public User() {
    }

    public User(String firstName, String lastName, String fatherName, int age, LocalDate birthDate, String job,
                boolean isMarried, String address, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.age = age;
        this.birthDate = birthDate;
        this.job = job;
        this.isMarried = isMarried;
        this.address = address;
        this.userName = userName;
        this.password = password;
    }
}
