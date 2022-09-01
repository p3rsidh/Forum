package com.Forum.CursosForum.controller;


import com.Forum.CursosForum.Model.RespostaModel;
import com.Forum.CursosForum.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Controller
public class RespostaController {

    @Autowired
    private RespostaService service;

    @GetMapping(path = "/resposta")
    public List<RespostaModel>buscarTodasMensagem(){
        return service.buscarTodasMensagens();
    }

    @GetMapping(path = "/resposta/{dataDaCriacao}")
    public Optional<RespostaModel> buscarPorData(@PathVariable Long dataDaCriacao) {

        return service.buscarPorData(buscarPorData);
    }

    @PostMapping(path = "resposta")
    public RespostaModel buscarPorStatus(@RequestBody RespostaModel status){
        return
    }


}
