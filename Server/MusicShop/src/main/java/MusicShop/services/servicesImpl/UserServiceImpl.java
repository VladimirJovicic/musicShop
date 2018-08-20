package MusicShop.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import MusicShop.entities.User;
import MusicShop.repositories.UserRepository;
import MusicShop.services.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findOne(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
