package com.Forum.CursosForum.service;

import com.Forum.CursosForum.model.UsuarioModel;
import com.Forum.CursosForum.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioModel> buscarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarPorId(Long codigo) {
        return usuarioRepository.findById(codigo);
    }

    public UsuarioModel cadastrar(UsuarioModel usuarioModel) {
        usuarioModel.getCodigo();
        usuarioModel.getNome();
        usuarioModel.getEmail();
        usuarioModel.getSenha();
        return usuarioRepository.save(usuarioModel);
    }

    public UsuarioModel alterar(UsuarioModel usuarioModel, Long codigo) {
        usuarioModel.getCodigo();
        usuarioModel.getNome();
        usuarioModel.getEmail();
        usuarioModel.getSenha();
        return usuarioRepository.save(usuarioModel);
    }

    public void deletar(Long codigo) {
        usuarioRepository.deleteById(codigo);
    }
}
