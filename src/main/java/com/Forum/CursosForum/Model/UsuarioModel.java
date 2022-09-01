package com.Forum.CursosForum.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column
    private String nome;
}
