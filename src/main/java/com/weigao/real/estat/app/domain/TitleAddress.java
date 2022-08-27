package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Embeddable
public class TitleAddress {

    @Column(name = "titleAddr_id")
    private Long id;
    @Column(name = "titleAddr_line1")
    private String addressLine1;
    @Column(name = "titleAddr_line2")
    private String addressLine2;
    @Column(name = "titleAddr_city")
    private String city;
    @Column(name = "titleAddr_state")
    private String state;
    @Column(name = "titleAddr_zip")
    private String zip;

    public TitleAddress() {
    }
}
