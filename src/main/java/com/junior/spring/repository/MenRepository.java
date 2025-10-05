package com.junior.spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MenRepository {
    
    public String ObterMensagemString(){
        return "Ola do repositorio";
    }
}
