package com.Forum.CursosForum.repository;

import com.Forum.CursosForum.enumeration.Categorias;
import com.Forum.CursosForum.model.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Long> {
    public List<CursoModel> findByCategoria(Categorias categoria);
}
