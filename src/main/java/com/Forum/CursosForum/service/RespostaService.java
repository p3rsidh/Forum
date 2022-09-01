package com.Forum.CursosForum.service;

import com.Forum.CursosForum.Model.RespostaModel;
import com.Forum.CursosForum.Repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    public List<RespostaModel>buscarTodasMensagens(){
        return respostaRepository.findAll();
    }

    public Optional<RespostaModel> buscarPorData(Long buscarPorData){
        return respostaRepository.findById(buscarPorData);
    }

    public RespostaModel status(RespostaModel status){
        RespostaRepository.
    }
}
