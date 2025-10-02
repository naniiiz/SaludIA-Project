package com.salud.appsaludai.Repository;

import com.salud.appsaludai.Entidades.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnfermedadRepository extends JpaRepository<Enfermedad,Long> {
    List<Enfermedad> findByNombreContainingIgnoreCase(String palabra);
}
