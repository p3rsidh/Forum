package com.Forum.CursosForum.Controller;
import com.Forum.CursosForum.Model.CursoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.Forum.CursosForum.Service.CursoService;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
   CursoService cursoService;

    @PostMapping(path = "/forum/curso")
    @ResponseStatus(HttpStatus.CREATED)
    public CursoModel cadastrarCurso(@RequestBody CursoModel cursoModel){
        return cursoService.cadastrarCurso(cursoModel);
    }

    @GetMapping(path = "/forum/curso/{categoria}")
    public List<CursoModel> buscarPorCategorias(@PathVariable String categoria){
        return cursoService.encontrarPorCategoria(categoria);
    }

    @GetMapping(path = "/forum/curso")
    public List<CursoModel> buscarTodos(){
        return cursoService.encontrarTodos();
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
