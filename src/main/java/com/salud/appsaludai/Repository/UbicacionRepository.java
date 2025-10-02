package com.salud.appsaludai.Repository;

import com.salud.appsaludai.Entidades.Ubicacion;
import com.salud.appsaludai.Entidades.UsuarioGeneral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UbicacionRepository extends JpaRepository<Ubicacion,Long> {

}
