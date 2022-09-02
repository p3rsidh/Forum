package com.Forum.CursosForum.controller;
import com.Forum.CursosForum.model.CursoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Forum.CursosForum.service.CursoService;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    CursoService cursoService;

    @PostMapping(path = "/forum/curso/cadastrar")
    @ResponseStatus
    public CursoModel cadastrarCurso(@RequestBody CursoModel cursoModel){
        return cursoService.cadastrarCurso(cursoModel);
    }

    @GetMapping(path = "/forum/curso/{categoria}")
    public List<CursoModel> buscarPorCategorias(@PathVariable String categoria){
        return cursoService.encontrarPorCategoria(categoria);
    }

    @PutMapping(path = "/forum/curso/{codigo}")
    public CursoModel editarCurso(@PathVariable Long codigo, @RequestBody CursoModel cursoModel){
        return cursoService.editarCurso(cursoModel);
    }

    @GetMapping(path = "/forum/curso/{codigo}")
    public List<CursoModel> deletarCurso(@PathVariable Long codigo){
        return cursoService.deletarCurso(codigo);
    }

}
