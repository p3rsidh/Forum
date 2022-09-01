package com.Forum.CursosForum.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "resposta")
public class RespostaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mensagem;

    @Column(nullable = false)
    private LocalDate dataCriacao;

    @Column(nullable = false)
    private Boolean status;


}
