package br.com.pedromaia.gestao_vagas.modules.candidates.controllers;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedromaia.gestao_vagas.modules.candidates.CandidateEntity;
import br.com.pedromaia.gestao_vagas.modules.candidates.CandidateRepository;

@RestController
@RequestMapping("/candidates")
public class CandidateContrller {

  @Autowired
  private CandidateRepository candidateRepository;

  @PostMapping("/")
  public CandidateEntity create(@Valid @RequestBody CandidateEntity candidate) {
    return this.candidateRepository.save(candidate);
  }
}
