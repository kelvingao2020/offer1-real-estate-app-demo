package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Embeddable
public class EscrowCompany {

    @Column(name = "escrow_id")
    private Long id;
    @Column(name = "escrow_name")
    private String name;
    @Column(name = "escrow_phone")
    private String phone;
    @Column(name = "escrow_email")
    private String email;

    @Column(name = "escrow_officerName")
    private String officerName;
    @Column(name = "escrow_type")
    private String type;

    @Embedded
    private EscrowAddress address;

    public EscrowCompany() {
    }
}
