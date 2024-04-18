package br.edu.toycenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.toycenter.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
