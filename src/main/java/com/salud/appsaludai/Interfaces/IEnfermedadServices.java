package com.salud.appsaludai.Interfaces;

import com.salud.appsaludai.DTO.EnfermedadDTO;
import com.salud.appsaludai.Entidades.Enfermedad;

import java.util.List;

public interface IEnfermedadServices {
    EnfermedadDTO registrar(EnfermedadDTO enfermedadDTO);
    List<EnfermedadDTO> findAll();
    Enfermedad findById(Long id);
    Enfermedad actualizar(Enfermedad enfermedad);
    void borrar(Long id);
    List<EnfermedadDTO> buscarPorNombre(String palabra);
}
