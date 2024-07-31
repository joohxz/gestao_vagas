package br.com.joaomoraes.gestao_vagas.modules.candidates.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaomoraes.gestao_vagas.modules.candidates.CandidateEntity;


@RestController
@RequestMapping("/candidate")
public class CandidateController {
    

    @PostMapping("/")
    public void  createCandidate(@RequestBody CandidateEntity candidateEntity) {
        System.out.println("Candidato");
        System.out.println(candidateEntity.getEmail()); 
        System.out.println(candidateEntity.getName()); 
        System.out.println(candidateEntity.getUsername());
        System.out.println(candidateEntity.getPassword());
        System.out.println(candidateEntity.getDescription());
    }
}
