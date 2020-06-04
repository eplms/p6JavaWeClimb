package com.emmanuel.plumas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// Classe qui contiendra toutes les méthodes (CRUD) qui s'appliquent à la table utilisateur
@Service
public class UserService {
	@Autowired
	private IUserEntityRepository userRepository;
	
	public UserEntity getUser(Long id) {
		UserEntity u= userRepository.findById(id).get();
		return u;
	}
	
}
