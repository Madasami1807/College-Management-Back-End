package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.edubridge.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

	
}
