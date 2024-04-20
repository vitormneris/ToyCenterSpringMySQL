package br.edu.toycenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.toycenter.entities.OrderItem;
import br.edu.toycenter.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
