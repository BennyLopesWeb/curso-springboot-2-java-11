package com.treinamentoJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoJava.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
