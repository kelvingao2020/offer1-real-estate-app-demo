package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Embeddable
public class Property {

    @Column( name = "property_id")
    private Long id;
    private String propertyType;
    private int squareFeet;
    private int numberBedrooms;
    private int numberBaths;
    private String description;
    private String ownerType;
    private String primaryImageUrl;

    @Embedded
    private PropertyAddress address;

    @Embedded
    private PrimaryOwner primaryOwner;

    public Property() {
    }
}
