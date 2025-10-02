package com.salud.appsaludai.Interfaces;

import com.salud.appsaludai.DTO.DiagnosticoDTO;
import com.salud.appsaludai.Entidades.Diagnostico;

import java.time.LocalDateTime;
import java.util.List;

public interface IDiagnosticoServices {
    Diagnostico findById(Long id);
    DiagnosticoDTO registrar(DiagnosticoDTO diagnosticoDTO);
    void borrar(Long id);
    List<DiagnosticoDTO> findAll();
    Diagnostico actualizar(Diagnostico diagnostico);
    List<DiagnosticoDTO> buscarPorUsuario(Long idUsuario);
}
