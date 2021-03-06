package MusicShop.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MusicShop.entities.Role;
import MusicShop.repositories.RoleRepository;
import MusicShop.services.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role findOne(Long id) {
		return roleRepository.findOne(id);
	}

	@Override
	public List<Role> findByName(String name) {
		return roleRepository.findByName(name);
	}

}
