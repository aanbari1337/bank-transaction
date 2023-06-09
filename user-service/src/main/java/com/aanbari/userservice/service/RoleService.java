package com.aanbari.userservice.service;

import com.aanbari.userservice.model.Role;
import com.aanbari.userservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public Role addRole(Role role){
        return roleRepository.save(role);
    }
}
