package com.salud.appsaludai.security.repositories;

import com.salud.appsaludai.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
