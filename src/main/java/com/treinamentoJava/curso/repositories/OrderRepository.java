package com.treinamentoJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoJava.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
