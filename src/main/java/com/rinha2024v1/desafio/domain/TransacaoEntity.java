package com.rinha2024v1.desafio.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity(name = "transacao")
public class TransacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transacao_seq")
    @SequenceGenerator(name = "transacao_seq", sequenceName = "transacao_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "id_cliente")
    private Integer id_cliente;
    @Column(name = "valor")
    private Integer valor;
    @Column(name = "tipo")
    private char tipo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "data_transacao")
    private LocalDateTime data_transacao;
}
