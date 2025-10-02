package com.salud.appsaludai.Controllers;


import com.salud.appsaludai.DTO.DiagnosticoDTO;
import com.salud.appsaludai.Interfaces.IDiagnosticoServices;
import com.salud.appsaludai.Repository.DiagnosticoRepository;
import com.salud.appsaludai.Entidades.Diagnostico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/")
public class DiagnosticoController {
    @Autowired
    private IDiagnosticoServices diagnosticoService;
    @Transactional
    @PostMapping("diagnosticos")
    public DiagnosticoDTO registrar(@RequestBody DiagnosticoDTO diagnosticoDTO) {
        return diagnosticoService.registrar(diagnosticoDTO);
    }

    @GetMapping("diagnosticos")
    public List<DiagnosticoDTO> findAll() {
        return diagnosticoService.findAll();
    }

    @GetMapping("diagnosticos/{id}")
    public Diagnostico findById(@PathVariable Long id) {
        return diagnosticoService.findById(id);
    }

    @PutMapping("diagnosticos/{id}")
    public Diagnostico actualizar(@RequestBody Diagnostico diagnostico) {
        return diagnosticoService.actualizar(diagnostico);
    }

    @DeleteMapping("diagnosticos/{id}")
    public void borrar(@PathVariable Long id) {
        diagnosticoService.borrar(id);
    }

    @GetMapping("diagnosticos/usuario/{idUsuario}")
    public List<DiagnosticoDTO> buscarPorUsuario(@PathVariable Long idUsuario) {
        return diagnosticoService.buscarPorUsuario(idUsuario);
    }


}
