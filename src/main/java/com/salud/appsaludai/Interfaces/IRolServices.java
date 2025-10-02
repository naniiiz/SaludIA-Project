package com.salud.appsaludai.Interfaces;

import com.salud.appsaludai.DTO.RolDTO;
import com.salud.appsaludai.Entidades.Rol;

import java.util.List;

public interface IRolServices {
    RolDTO registrar(RolDTO rolDTO);
    List<RolDTO> findAll();
    Rol findById(Long id);
    Rol actualizar(Rol rol);
    void borrar(Long id);
    RolDTO findByRol(String rol);
}
