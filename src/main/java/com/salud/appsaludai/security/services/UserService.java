package com.salud.appsaludai.security.services;

import com.salud.appsaludai.security.entities.Role;
import com.salud.appsaludai.security.entities.User;
import com.salud.appsaludai.security.repositories.RoleRepository;
import com.salud.appsaludai.security.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void grabar(Role role) {roleRepository.save(role);}
    public Integer insertUserRol(Long user_id, Long rol_id) {
        Integer result = 0;
        userRepository.insertUserRol(user_id, rol_id);
        return 1;
    }
}
