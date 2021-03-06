package br.com.treinaweb.adoteumpet.api.adocao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.treinaweb.adoteumpet.api.adocao.dtos.AdocaoResponse;
import br.com.treinaweb.adoteumpet.api.adocao.services.AdocaoService;

@RestController
public class AdocaoController {
    
    @Autowired
    private AdocaoService adocaoService;

    @PostMapping("/api/adocoes")
    @ResponseStatus(code = HttpStatus.CREATED)
    public AdocaoResponse create(@RequestBody AdocaoRequest adocaoRequest){
        return adocaoService.create(adocaoRequest);
    }
}
