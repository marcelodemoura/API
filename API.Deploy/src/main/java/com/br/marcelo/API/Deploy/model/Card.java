package com.br.marcelo.API.Deploy.model;

import jakarta.persistence.*;

@Entity(name = "tb_card")
public class Card {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Number getLimite() {
        return limite;
    }

    public void setLimite(Number limite) {
        this.limite = limite;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    @Column(scale = 13, precision = 2)
    private Number limite;

    public String getNumber() {return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Number getLimit() {
        return limite;
    }

    public void setLimit(Number limit) {
        this.limite = limit;
    }
}
