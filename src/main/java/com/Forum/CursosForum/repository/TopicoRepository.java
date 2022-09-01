package com.Forum.CursosForum.repository;

import com.Forum.CursosForum.model.TopicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<TopicoModel, Long> {
}
