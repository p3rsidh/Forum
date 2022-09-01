package com.Forum.CursosForum.service;
import com.Forum.CursosForum.enumeration.Categorias;
import com.Forum.CursosForum.model.CursoModel;
import com.Forum.CursosForum.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public CursoModel cadastrarCurso(CursoModel cursoModel){
        return cursoRepository.save(cursoModel);
    }

    public List<CursoModel> encontrarTodos(){
        return cursoRepository.findAll();
    }

    public List<CursoModel> encontrarPorCategoria(String categoria){
        if (categoria.contains("INFORMATICA")){
            return cursoRepository.findByCategoria(Categorias.INFORMATICA);
        }else if (categoria.contains("DIREITO")){
            return cursoRepository.findByCategoria(Categorias.DIREITO);
        }else if (categoria.contains("ADMINISTRACAO")){
            return cursoRepository.findByCategoria(Categorias.ADMINISTRACAO);
        }
        return null;
    }

    public CursoModel editarCurso(CursoModel cursoModel){
        return cursoRepository.save(cursoModel);
    }

    public List<CursoModel> deletarCurso(Long id){
        cursoRepository.deleteById(id);
        return encontrarTodos();
    }





}
