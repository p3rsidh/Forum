package com.Forum.CursosForum.Repository;

import com.Forum.CursosForum.Model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<UsuarioModel, Long> {
}
