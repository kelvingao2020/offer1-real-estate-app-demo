package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Embeddable
public class EscrowAddress {

    @Column(name = "escrowAddr_id")
    private Long id;
    @Column(name = "escrowAddr_line1")
    private String addressLine1;
    @Column(name = "escrowAddr_line2")
    private String addressLine2;
    @Column(name = "escrowAddr_city")
    private String city;
    @Column(name = "escrowAddr_state")
    private String state;
    @Column(name = "escrowAddr_zip")
    private String zip;

    public EscrowAddress() {
    }
}

