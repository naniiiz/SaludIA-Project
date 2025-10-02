package com.salud.appsaludai.Interfaces;

import com.salud.appsaludai.DTO.SintomaDTO;
import com.salud.appsaludai.Entidades.Sintoma;

import java.util.List;

public interface ISintomaServices {
    SintomaDTO registrar(SintomaDTO sintomaDTO);
    List<SintomaDTO> findAll();
    Sintoma findById(Long id);
    Sintoma actualizar(Sintoma sintoma);
    void borrar(Long id);
    List<SintomaDTO> buscarPorNombre(String palabra);
}
