package com.edubridge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.entity.Role;
import com.edubridge.repository.RoleRepository;



@Service
public class RoleService {

	@Autowired RoleRepository roleRepository;
	
	public Role addUserRole(Role role) {
		return roleRepository.saveAndFlush(role);
	}


}
