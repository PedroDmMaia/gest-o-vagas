package br.com.pedromaia.gestao_vagas.modules.candidates.controllers;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedromaia.gestao_vagas.modules.candidates.CandidateEntity;

@RestController
@RequestMapping("/candidates")
public class CandidateContrller {

  @PostMapping("/")
  public void create(@Valid @RequestBody CandidateEntity candidate) {
    System.out.println(candidate);
  }


}
