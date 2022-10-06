package com.edubridge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.edubridge.entity.Role;
import com.edubridge.services.RoleService;



@Controller
public class RoleController {

    @Autowired RoleService roleService;	
	
    //add user role
	public Role addUserRole(Role role) {
		return roleService.addUserRole(role);
	}
}
