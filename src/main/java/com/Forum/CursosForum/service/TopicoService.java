package com.Forum.CursosForum.service;

import com.Forum.CursosForum.model.TopicoModel;
import com.Forum.CursosForum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public TopicoModel cadastrarTopico(TopicoModel topicoModel){
        return topicoRepository.save(topicoModel);
    }

    public List<TopicoModel> buscarTopicos(){
        return topicoRepository.findAll();
    }

    public TopicoModel editarTopicos(TopicoModel topicoModel){
        return topicoRepository.save(topicoModel);
    }

    public List<TopicoModel> deletarTopico(Long id){
       topicoRepository.deleteById(id);
        return topicoRepository.findAll();
    }


}
