package com.junior.spring.service;

import org.springframework.stereotype.Service;

import com.junior.spring.controll;

@Service
public class MensagemServer {
    
    private final controll mensagemRepository;

    public MensagemServer(controll mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String getMethodName(){
        return mensagemRepository.getMethodName();
    }
}
