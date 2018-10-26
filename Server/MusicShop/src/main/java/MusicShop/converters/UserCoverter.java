package MusicShop.converters;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import MusicShop.dtos.UserDTO;
import MusicShop.entities.Article;
import MusicShop.entities.Role;
import MusicShop.entities.User;

public class UserCoverter {
	

	
	public UserCoverter(){}
	
	public User dtoToEntity (UserDTO dto,Role role){
		
		User u = new User();
		u.setActivated(false);
		u.setCart(new HashSet<Article>());
		u.setEmail(dto.getEmail());
		u.setPassword(new BCryptPasswordEncoder().encode(dto.getPassword()));
		u.setUsername(dto.getUsername());
		u.setRole(role);
		return u;
	}
}
