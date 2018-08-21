package MusicShop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import MusicShop.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	List<Role> findByName(String name);
}
