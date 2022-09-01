package com.Forum.CursosForum.controller;
import com.Forum.CursosForum.service.TopicoService;
import com.Forum.CursosForum.model.TopicoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicoController {

    @Autowired
    TopicoService topicoService;

    @PostMapping(path = "/forum/topicos")
    @ResponseStatus
    public TopicoModel cadastrarTopico(TopicoModel topicoModel){
        return topicoService.cadastrarTopico(topicoModel);
    }

    @GetMapping(path = "/forum/topicos")
    public List<TopicoModel> mostrarTodos(){
        return topicoService.buscarTopicos();
    }

    @PutMapping(path = "/forum/topicos/{codigo}")
    public TopicoModel editar(@PathVariable Long codigo, @RequestBody TopicoModel topicoModel){
        return topicoService.editarTopicos(topicoModel);
    }

    @DeleteMapping(path = "/forum/topicos/{codigo}")
    public List<TopicoModel> deletarTopico(@PathVariable Long id){
        return topicoService.deletarTopico(id);
    }



}
