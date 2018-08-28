package MusicShop.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import MusicShop.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUsername(String username);
	Optional<User> findById(Long id);
}
