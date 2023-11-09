package com.br.marcelo.API.Deploy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "tb_card")
public class Card {

    @Column(unique = true)
    private String number;
    @Column(scale = 13, precision = 2)
    private Number limit;

    public String getNumber() {return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Number getLimit() {
        return limit;
    }

    public void setLimit(Number limit) {
        this.limit = limit;
    }
}
