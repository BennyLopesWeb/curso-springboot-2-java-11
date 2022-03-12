package com.treinamentoJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoJava.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
