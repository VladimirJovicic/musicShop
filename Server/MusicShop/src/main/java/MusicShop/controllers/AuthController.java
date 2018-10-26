package MusicShop.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import MusicShop.converters.UserCoverter;
import MusicShop.dtos.UserDTO;
import MusicShop.entities.User;
import MusicShop.services.RoleService;
import MusicShop.services.UserService;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;
    
	@Autowired
	private RoleService roleService;
    
    private UserCoverter userCoverter = new UserCoverter();
    
    @RequestMapping(value="/register",method=RequestMethod.POST)
    public ResponseEntity<?> register(@RequestBody UserDTO dto) {
    	if(dto.getPassword().equals(dto.getRepeatPassword()) == false) {
    		return new ResponseEntity<String>("Sifre se ne poklapaju",HttpStatus.BAD_REQUEST);
    	}
    	
    	for(User u : userService.findAll()){
    		if(u.getUsername().equals(dto.getUsername())) {
    			return new ResponseEntity<String>("Korisnik sa istim imenom vec postoji",HttpStatus.BAD_REQUEST);
    		}
    	}
    	
    	for(User u : userService.findAll()){
    		if(u.getEmail().equals(dto.getEmail())) {
    			return new ResponseEntity<String>("Korisnik sa istom email adresom vec postoji",HttpStatus.BAD_REQUEST);
    		}
    	}
    	
    	userService.save(userCoverter.dtoToEntity(dto,roleService.findOne(Long.valueOf(1))));
    	
    	return new ResponseEntity<UserDTO>(dto,HttpStatus.OK);
    }
    

}
