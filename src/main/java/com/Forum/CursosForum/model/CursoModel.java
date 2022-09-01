package com.Forum.CursosForum.model;

import com.Forum.CursosForum.enumeration.Categorias;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "curso")
public class CursoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Categorias categoria;

}
