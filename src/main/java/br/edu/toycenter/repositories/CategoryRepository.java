package br.edu.toycenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.toycenter.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
