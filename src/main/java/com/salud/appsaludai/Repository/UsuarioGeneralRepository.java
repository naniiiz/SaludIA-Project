package com.salud.appsaludai.Repository;

import com.salud.appsaludai.Entidades.UsuarioGeneral;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UsuarioGeneralRepository extends JpaRepository<UsuarioGeneral,Long> {
    List<UsuarioGeneral> findByNombreContaining(String palabra);

}
