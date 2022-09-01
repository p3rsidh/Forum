package com.Forum.CursosForum.controller;

import com.Forum.CursosForum.Model.UsuarioModel;
import com.Forum.CursosForum.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(path = "/usuarios")
    public ResponseEntity<List<UsuarioModel>> buscarTodosUsuarios() {
        return ResponseEntity.ok(usuarioService.buscarTodos());
    }

    @GetMapping(path = "/usuario/{codigo}")
    public ResponseEntity<Optional> buscarUsuarioPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(usuarioService.buscarPorId(codigo));
    }

    @PostMapping(path = "/usuarios")
    public ResponseEntity<UsuarioModel> cadastrarUsuario(@RequestBody UsuarioModel usuarioModel) {
        return new ResponseEntity<>(usuarioModel, HttpStatus.CREATED);
    }

    @PutMapping(path = "/usuarios/{codigo}")
    public ResponseEntity<UsuarioModel> alterarUsuario(@RequestBody UsuarioModel usuarioModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(usuarioService.alterar(usuarioModel, codigo));
    }

    @DeleteMapping(path = "/usuarios/{codigo}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable Long codigo) {
        return ResponseEntity.noContent(usuarioService.deletar(codigo));
    }
}
