package com.Forum.CursosForum.Service;
import com.Forum.CursosForum.Enum.Categorias;
import com.Forum.CursosForum.Model.CursoModel;
import com.Forum.CursosForum.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<CursoModel> encontrarTodos(){
        return cursoRepository.findAll();
    }

    public Optional<CursoModel> encontrarPorId(Long codigo){
        return cursoRepository.findById(codigo);
    }

    public List<CursoModel> encontrarPorCategoria(String categoria){
        if (categoria.contains("INFORMATICA")){
            return cursoRepository.findByCategoria(Categorias.INFORMATICA);
        }else if (categoria.contains("DIREITO")){
            return cursoRepository.findByCategoria(Categorias.DIREITO);
        }else if (categoria.contains("ADMINISTRACAO")){

        }
        return null;
    }

}
