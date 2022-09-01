package com.Forum.CursosForum.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "topicos")
public class TopicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
