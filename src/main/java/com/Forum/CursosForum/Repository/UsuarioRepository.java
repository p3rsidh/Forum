package com.Forum.CursosForum.Repository;

import com.Forum.CursosForum.Model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long> {
}
