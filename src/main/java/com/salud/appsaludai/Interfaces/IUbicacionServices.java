package com.salud.appsaludai.Interfaces;

import com.salud.appsaludai.DTO.UbicacionDTO;
import com.salud.appsaludai.Entidades.Ubicacion;

import java.util.List;

public interface IUbicacionServices {
    UbicacionDTO registrar(UbicacionDTO ubicacionDTO);
    List<UbicacionDTO> findAll();
    Ubicacion findById(Long id);
    Ubicacion actualizar(Ubicacion ubicacion);
    void borrar(Long id);
}
