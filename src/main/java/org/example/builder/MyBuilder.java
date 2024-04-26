package org.example.builder;

import java.time.LocalDate;

public class MyBuilder {
    public static void main(String[] args) {

//        User user = new User("Ali", "gholi", "jafar", 20, LocalDate.of(1380, 12, 12), "student"
//                , false, "Address1", "Ali123", "1111");

        // System.out.println(user);

//        User user = new User.Builder()
//                .setFirstName("Ali")
//                .setLastName("Gholi")
//                .setFatherName("jafar")
//                .setAge(20)
//                .setBirthdate(LocalDate.of(1380, 12, 12))
//                .setJob("student")
//                .setIsMarried(false)
//                .setAddress("address1")
//                .setUserName("Ali123")
//                .setPassword("1111")
//                .build();
//        System.out.println(user);
//    }

        User user = User.builder()
                .setFirstName("Ali")
                .setLastName("Gholi")
                .setFatherName("jafar")
                .setAge(20)
                .setBirthDate(LocalDate.of(1380, 12, 12))
                .setJob("student")
                .setIsMarried(false)
                .setAddress("address1")
                .setUserName("Ali123")
                .setPassword("1111")
                .build();
        System.out.println(user);
    }


}
