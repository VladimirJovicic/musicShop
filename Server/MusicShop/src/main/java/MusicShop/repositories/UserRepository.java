package MusicShop.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import MusicShop.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
