package com.junior.spring.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junior.spring.service.ProdutoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.junior.spring.model.Produto;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.HttpStatus;

import com.junior.spring.exceptions.RecursoNaoEncontradoExc;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> ListarProdutos() {
        return produtoService.listarProdutos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProdEntity(@PathVariable Long id) {
        Produto produto = produtoService.buscarPorId(id);
        return ResponseEntity.ok(produto);

    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
    
        return produtoService.salvaProduto(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }
}
