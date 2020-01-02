package com.emmanuel.plumas;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
	@Autowired
	private IUserEntityRepository userRepository;
	
	public UserEntity getUser(Long id) {
		UserEntity u=userRepository.findById(id).get();
		return u;
	}
	
}
