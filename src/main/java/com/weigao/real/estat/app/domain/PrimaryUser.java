package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Embeddable
public class PrimaryUser {

    @Column(name = "primary_user_Id")
    private Long id;
    @Column(name = "primary_user_firstName")
    private String firstName;
    @Column(name = "primary_user_lastName")
    private String lastName;
    @Column(name = "primary_user_email")
    private String email;
    @Column(name = "primary_user_phone")
    private String phone;
    @Column(name = "primary_user_status")
    private String status;

    public PrimaryUser() {
    }
}


