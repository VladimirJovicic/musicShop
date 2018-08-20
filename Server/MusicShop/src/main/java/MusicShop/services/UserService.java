package MusicShop.services;

import java.util.List;

import MusicShop.entities.User;

public interface UserService {
	List<User> findAll();
	User findOne(Long id);
	User findByUsername(String username);

}
