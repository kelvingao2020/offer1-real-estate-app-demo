package com.weigao.real.estat.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Embeddable
public class PrimaryOwner {

    @Column(name = "primaryOwner_id")
    private Long id;

    @Embedded
    private PrimaryUser user;

    public PrimaryOwner() {
    }
}
