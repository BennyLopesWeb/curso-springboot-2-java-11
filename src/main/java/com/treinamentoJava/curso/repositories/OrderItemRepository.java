package com.treinamentoJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoJava.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
