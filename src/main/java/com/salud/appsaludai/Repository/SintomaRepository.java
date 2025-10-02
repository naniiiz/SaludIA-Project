package com.salud.appsaludai.Repository;

import com.salud.appsaludai.Entidades.Sintoma;
import com.salud.appsaludai.Entidades.UsuarioGeneral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SintomaRepository extends JpaRepository<Sintoma,Long> {
    List<Sintoma> findByNombreContainingIgnoreCase(String palabra);

}
