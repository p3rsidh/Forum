package com.Forum.CursosForum.service;

import com.Forum.CursosForum.Model.RespostaModel;
import com.Forum.CursosForum.enumeration.StatusTopico;
import com.Forum.CursosForum.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    public List<RespostaModel> buscarTodasMensagens() {
        return respostaRepository.findAll();
    }

    public List<RespostaModel> buscarPorStatus(StatusTopico status) {
        return respostaRepository.findByStatus(status);
    }

    public Optional<RespostaModel> buscarPorId(Long id) {
        return respostaRepository.findById(id);
    }

    public RespostaModel cadastrar(RespostaModel resposta) {
        resposta.getResposta();
        resposta.getStatus();
        resposta.getCodigo();
        resposta.getSolucao();
        resposta.getDataCriacao();

        return respostaRepository.save(resposta);
    }

    public List<RespostaModel> alteracao(RespostaModel respostaModel) {

        respostaModel.getResposta();
        respostaModel.getStatus();
        respostaModel.getSolucao();
        respostaModel.getDataCriacao();

        respostaRepository.save(respostaModel);
        return buscarTodasMensagens();
    }
    public void deletar(Long respostaporid){
        respostaRepository.deleteById(respostaporid);
    }
}
