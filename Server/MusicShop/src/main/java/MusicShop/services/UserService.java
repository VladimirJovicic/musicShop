package MusicShop.services;

import java.util.List;
import java.util.Optional;

import MusicShop.entities.User;

public interface UserService {
	List<User> findAll();
	User findOne(Long id);
	Optional<User> findByUsername(String username);
	Optional<User> findById(Long id);
	public User save(User user);

}
