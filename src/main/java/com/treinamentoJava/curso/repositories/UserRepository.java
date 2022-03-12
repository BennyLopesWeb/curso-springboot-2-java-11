package com.treinamentoJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoJava.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
