package com.Forum.CursosForum.Repository;

import com.Forum.CursosForum.Model.Usuario.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumRepository extends JpaRepository<UsuarioModel, Long> {
}
