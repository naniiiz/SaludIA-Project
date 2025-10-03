package com.salud.appsaludai.Security.Repositories;

import com.salud.appsaludai.Security.Entidades.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
