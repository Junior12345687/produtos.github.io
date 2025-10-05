package com.junior.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.junior.spring.exceptions.RecursoNaoEncontradoExc;
import com.junior.spring.model.Produto;
import com.junior.spring.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id){
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoExc("Produto com ID " + id + " não encontrado!"));
    }

    public Produto salvaProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id){

        if (!produtoRepository.existsById(id)){
            throw new RecursoNaoEncontradoExc("Produto com ID " + id + " não encontrado!");
        }

        produtoRepository.deleteById(id);
    }

    
}