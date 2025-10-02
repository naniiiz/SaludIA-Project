package com.salud.appsaludai.Repository;

import com.salud.appsaludai.Entidades.Diagnostico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface DiagnosticoRepository extends JpaRepository<Diagnostico,Long> {
    List<Diagnostico> findByUsuario_Id(Long idUsuario);

}
