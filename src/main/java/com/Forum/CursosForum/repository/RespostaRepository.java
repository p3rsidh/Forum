package com.Forum.CursosForum.Repository;

import com.Forum.CursosForum.Model.RespostaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends JpaRepository <RespostaModel> {


}
