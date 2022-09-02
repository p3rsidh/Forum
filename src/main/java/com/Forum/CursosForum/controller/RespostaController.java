package com.Forum.CursosForum.controller;


import com.Forum.CursosForum.Model.RespostaModel;
import com.Forum.CursosForum.enumeration.StatusTopico;
import com.Forum.CursosForum.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class RespostaController {

    @Autowired
    private RespostaService respostaService;

    @GetMapping(path = "/forum/resposta")
    public List<RespostaModel> buscarTodasMensagem() {
        return respostaService.buscarTodasMensagens();
    }

    @GetMapping(path = "/forum/resposta/{id}")
    public Optional<RespostaModel> buscarPorId(@PathVariable Long id) {
        return respostaService.buscarPorId(id);

    }

    @PostMapping(path = "/forum/resposta")
    public List<RespostaModel> buscarPorStatus(@PathVariable StatusTopico status) {
        return respostaService.buscarPorStatus(status);
    }

    @PostMapping(path = "/forum/resposta")
    public RespostaModel cadastrarResposta(@RequestBody RespostaModel resposta){
        return respostaService.cadastrar(resposta);
    }

    @PutMapping(path = "/forum/{alterarporid}")
    public RespostaModel alterarResposta(@RequestBody RespostaModel respostaModel, @PathVariable Long codigo){
        return ResponseEntity.ok(respostaService.alteracao(respostaModel, Long codigo);
    }

    @DeleteMapping(path = "forum/ {alterarporid}")
    public void deletarResposta(@PathVariable Long respostaporid) {
        respostaService.deletar(respostaporid);

    }


}
