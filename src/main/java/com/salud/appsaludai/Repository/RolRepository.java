package com.salud.appsaludai.Repository;

import com.salud.appsaludai.Entidades.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol,Long> {
    Rol findByRol(String rol);
}
