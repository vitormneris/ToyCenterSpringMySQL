package br.edu.toycenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.toycenter.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
