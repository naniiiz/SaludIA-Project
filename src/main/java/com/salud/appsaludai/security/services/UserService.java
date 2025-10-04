package com.salud.appsaludai.security.services;

import com.salud.appsaludai.security.entities.User;
import com.salud.appsaludai.security.repositories.RoleRepository;
import com.salud.appsaludai.security.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }
}
