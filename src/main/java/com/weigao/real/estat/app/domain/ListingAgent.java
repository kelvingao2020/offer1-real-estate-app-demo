package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Embeddable
public class ListingAgent {

    @Column(name = "listing_id")
    private Long id;
    private String licenseNumber;
    private String licenseState;
    @Column(name = "listing_status")
    private String status;

    @Embedded
    private ListingUser user;

    public ListingAgent() {
    }
}
