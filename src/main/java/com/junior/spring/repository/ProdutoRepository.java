package com.junior.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junior.spring.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
