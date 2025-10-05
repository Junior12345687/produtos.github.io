package com.junior.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junior.spring.repository.MenRepository;

@RestController
@RequestMapping("/api")
public class mesageController {
    private final MenRepository menRepository;

    public mesageController(MenRepository menRepository){
        this.menRepository = menRepository;
    }

    @GetMapping("/mensagem")
    public String mensagem(){
        return menRepository.ObterMensagemString();
    }
}
