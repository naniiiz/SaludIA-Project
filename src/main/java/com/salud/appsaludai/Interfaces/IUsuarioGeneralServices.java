package com.salud.appsaludai.Interfaces;

import com.salud.appsaludai.DTO.UsuarioGeneralDTO;
import com.salud.appsaludai.Entidades.UsuarioGeneral;

import java.util.List;

public interface IUsuarioGeneralServices {
    UsuarioGeneralDTO registrar(UsuarioGeneralDTO usuarioDTO);
    UsuarioGeneral actualizar(UsuarioGeneral usuario);
    void borrar(Long id);
    List<UsuarioGeneralDTO> findAll();
    UsuarioGeneral findById(Long id);
    //UsuarioGeneralDTO findByCorreo(String correo);
    //UsuarioGeneralDTO login(String correo, String password);
    List<UsuarioGeneralDTO> buscarPorNombre(String palabra);
    //List<UsuarioGeneralDTO> buscarPorRol(Long idRol);
    //List<UsuarioGeneralDTO> buscarPorUbicacion(Long idUbicacion);
}
