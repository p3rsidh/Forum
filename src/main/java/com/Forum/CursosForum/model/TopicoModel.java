package com.Forum.CursosForum.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "topicos")
public class TopicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column
    private Long mensagem;

    @Column
    private LocalDate dataCriacao;

}
