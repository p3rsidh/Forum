package com.Forum.CursosForum.repository;

import com.Forum.CursosForum.Model.RespostaModel;

import com.Forum.CursosForum.enumeration.StatusTopico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespostaRepository extends JpaRepository <RespostaModel, Long> {
    List<RespostaModel> findByStatus(StatusTopico statusTopico);


}
