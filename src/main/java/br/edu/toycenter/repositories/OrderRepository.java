package br.edu.toycenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.toycenter.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
