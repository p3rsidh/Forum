package com.Forum.CursosForum.Controller;

import com.Forum.CursosForum.Model.UsuarioModel;
import com.Forum.CursosForum.Service.UsuarioService;
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

    @GetMapping(path = "/forum/usuarios")
    public ResponseEntity<List<UsuarioModel>> buscarTodosUsuarios() {
        return ResponseEntity.ok(usuarioService.buscarTodos());
    }

    @GetMapping(path = "/forum/usuarios/{codigo}")
    public ResponseEntity<Optional> buscarUsuarioPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(usuarioService.buscarPorId(codigo));
    }

    @PostMapping(path = "/forum/usuarios")
    public ResponseEntity<UsuarioModel> cadastrarUsuario(@RequestBody UsuarioModel usuarioModel) {
        return new ResponseEntity<>(usuarioService.cadastrar(usuarioModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/forum/usuarios/{codigo}")
    public ResponseEntity<UsuarioModel> alterarUsuario(@RequestBody UsuarioModel usuarioModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(usuarioService.alterar(usuarioModel, codigo));
    }

    @DeleteMapping(path = "/forum/usuarios/{codigo}")
    public void deletarUsuario(@PathVariable Long codigo) {
        usuarioService.deletar(codigo);
    }
}
