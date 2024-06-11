package com.rinha2024v1.desafio.domain.transacao;

import com.rinha2024v1.desafio.domain.cliente.ClienteEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "transacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transacao_seq")
    @SequenceGenerator(name = "transacao_seq", sequenceName = "transacao_seq", allocationSize = 1)
    private Integer id;

    @ManyToOne
    @JoinColumn( name = "cliente_id", nullable = false)
    private ClienteEntity cliente;

    @Column(name = "valor", nullable = false)
    private Integer valor;

    @Column(name = "tipo", nullable = false)
    private char tipo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_transacao", nullable = false)
    private LocalDateTime data_transacao;
}
