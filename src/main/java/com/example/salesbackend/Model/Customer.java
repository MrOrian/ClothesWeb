package com.example.salesbackend.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer extends User{

    public Customer(String userName, String userPass, String userFullName, String userRole, LocalDate userDate, String userAddress, String userEmail, String userPhone, String userGender, String userStatus) {
        super(userName, userPass, userFullName, userRole, userDate, userAddress, userEmail, userPhone, userGender, userStatus);
    }
}
