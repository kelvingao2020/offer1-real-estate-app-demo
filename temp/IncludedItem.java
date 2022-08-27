package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class IncludedItem {

    @Column(name = "includedItem_id")
    private Long id;
    @Column(name = "includedItem_name")
    private String name;
    @Column(name = "includedItem_listing")
    private String listing;

}
