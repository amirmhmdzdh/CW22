package org.example.builder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Builder(setterPrefix = "set")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final String firstName;

    private final String lastName;

    private final String fatherName;

    private final int age;

    private final LocalDate birthDate;

    private final String job;

    private final boolean isMarried;

    private final String address;

    private final String userName;

    private final String password;

//    private User(Builder builder) {
//        this.firstName = builder.firstName;
//        this.lastName = builder.lastName;
//        this.fatherName = builder.fatherName;
//        this.age = builder.age;
//        this.birthDate = builder.birthDate;
//        this.job = builder.job;
//        this.isMarried = builder.isMarried;
//        this.address = builder.address;
//        this.userName = builder.userName;
//        this.password = builder.password;
//    }


    //    public User() {
//    }
//
//    public User(String firstName, String lastName, String fatherName, int age, LocalDate birthDate, String job,
//                boolean isMarried, String address, String userName, String password) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.fatherName = fatherName;
//        this.age = age;
//        this.birthDate = birthDate;
//        this.job = job;
//        this.isMarried = isMarried;
//        this.address = address;
//        this.userName = userName;
//        this.password = password;
//    }

//    public static class Builder {
//        private Long id;
//
//        private String firstName;
//
//        private String lastName;
//
//        private String fatherName;
//
//        private int age;
//
//        private LocalDate birthDate;
//
//        private String job;
//
//        private boolean isMarried;
//
//        private String address;
//
//        private String userName;
//
//        private String password;
//
//
//        public Builder setFirstName(String firstName) {
//            this.firstName = firstName;
//            return this;
//        }
//
//        public Builder setLastName(String lastName) {
//            this.lastName = lastName;
//            return this;
//        }
//
//        public Builder setFatherName(String fatherName) {
//            this.fatherName = fatherName;
//            return this;
//        }
//
//        public Builder setAge(int age) {
//            this.age = age;
//            return this;
//        }
//
//        public Builder setBirthdate(LocalDate birthDate) {
//            this.birthDate = birthDate;
//            return this;
//        }
//
//        public Builder setJob(String job) {
//            this.job = job;
//            return this;
//        }
//
//        public Builder setIsMarried(boolean isMarried) {
//            this.isMarried = isMarried;
//            return this;
//        }
//
//        public Builder setAddress(String address) {
//            this.address = address;
//            return this;
//        }
//
//        public Builder setUserName(String userName) {
//            this.userName = userName;
//            return this;
//        }
//
//        public Builder setPassword(String password) {
//            this.password = password;
//            return this;
//        }
//
//        public User build() {
//
//            return new User(this);
//        }
//
//
//    }
}
