package br.com.treinaweb.adoteumpet.api.pet.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.adoteumpet.api.pet.dtos.PetResponse;
import br.com.treinaweb.adoteumpet.api.pet.mappers.PetMapper;
import br.com.treinaweb.adoteumpet.api.pet.services.PetService;
import br.com.treinaweb.adoteumpet.core.repositories.PetRepository;

@RestController
public class PetController {
    
    @GetMapping("/api/pets")
    public List<PetResponse> findAll(){
        return petService.findAll();
    }
}
