package com.rinha2024v1.desafio.domain;

import jakarta.persistence.*;

@Entity(name="cliente")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    @SequenceGenerator(name = "cliente_seq", sequenceName = "cliente_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "limite")
    private Integer limite;
    @Column(name = "saldo")
    private Integer saldo;
}
