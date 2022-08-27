package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Embeddable
public class TitleCompany {

    @Column( name = "title_id")
    private Long id;
    @Column(name = "title_name")
    private String name;

    @Column(name = "title_phone")
    private String phone;
    @Column(name = "title_email")
    private String email;
    @Column(name = "title_officerName" )
    private String officerName;

    @Column(name = "title_type")
    private String type;

    @Embedded
    private TitleAddress address;

    public TitleCompany() {
    }
}
