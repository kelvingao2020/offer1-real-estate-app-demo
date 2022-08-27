package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String state;
    private int price;
    private int offer;

    @Embedded
    private Property property;

    @Embedded
    private EscrowCompany escrowCompany;

    @Embedded
    private TitleCompany titleCompany;

    @Embedded
    private ListingAgent listingAgent;

//    @Embedded
//    private IncludedItem[] includedItems;

    public Home() {
    }
}
