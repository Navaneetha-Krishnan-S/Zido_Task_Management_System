package com.task.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.entity.Role;


	
	@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	    
	}



