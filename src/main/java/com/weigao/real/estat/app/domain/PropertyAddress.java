package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Embeddable
public class PropertyAddress {

    @Column(name = "propertyAddr_id")
    private Long id;
    @Column(name = "propertyAddr_line1")
    private String addressLine1;
    @Column(name = "propertyAddr_line2")
    private String addressLine2;
    @Column(name = "propertyAddr_city")
    private String city;
    @Column(name = "propertyAddr_state")
    private String state;
    @Column(name = "propertyAddr_zip")
    private String zip;

    public PropertyAddress() {
    }
}



