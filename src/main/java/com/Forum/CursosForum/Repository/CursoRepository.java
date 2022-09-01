package com.Forum.CursosForum.Repository;

import com.Forum.CursosForum.Enum.Categorias;
import com.Forum.CursosForum.Model.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Long> {
    public List<CursoModel> findByCategoria(Categorias categoria);
}
