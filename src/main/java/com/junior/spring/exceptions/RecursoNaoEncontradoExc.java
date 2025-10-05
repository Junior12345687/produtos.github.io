package com.junior.spring.exceptions;

public class RecursoNaoEncontradoExc extends RuntimeException{
    
    public RecursoNaoEncontradoExc(String mensagem){
        super(mensagem);
    }
}
