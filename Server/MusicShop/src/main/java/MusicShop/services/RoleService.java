package MusicShop.services;

import java.util.List;

import MusicShop.entities.Role;

public interface RoleService {
	List<Role> findAll();
	Role findOne(Long id);
	List<Role> findByName(String name);
}
