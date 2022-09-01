package com.Forum.CursosForum.Model;

import com.Forum.CursosForum.enumeration.StatusTopico;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "resposta")
public class RespostaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false)
    private String resposta;

    private Long Codigo;

    @Column(nullable = false)
    private LocalDate dataCriacao;

    @Column(nullable = false)
    private StatusTopico status;

    @Column(nullable = false)
    private Boolean solucao;



}
