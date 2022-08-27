package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Embeddable
public class ListingUser {

    @Column(name = "listing_user_Id")
    private Long id;
    @Column(name = "listing_user_firstName")
    private String firstName;
    @Column(name = "listing_user_lastName")
    private String lastName;
    @Column(name = "listing_user_email")
    private String email;
    @Column(name = "listing_user_phone")
    private String phone;
    @Column(name = "listing_user_status")
    private String status;

    public ListingUser() {
    }
}