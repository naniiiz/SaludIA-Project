package com.salud.appsaludai.Controllers;

import com.salud.appsaludai.DTO.SintomaDTO;
import com.salud.appsaludai.Entidades.Sintoma;
import com.salud.appsaludai.Interfaces.ISintomaServices;
import com.salud.appsaludai.Repository.SintomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/")
public class SintomaController {
    @Autowired
    private ISintomaServices sintomaService;
    // CREATE
    @PostMapping("sintomas")
    public ResponseEntity<SintomaDTO> registrar(@RequestBody SintomaDTO sintomaDTO) {
        return ResponseEntity.ok(sintomaService.registrar(sintomaDTO));
    }

    // READ ALL
    @GetMapping("sintomas")
    public ResponseEntity<List<SintomaDTO>> listar() {
        return ResponseEntity.ok(sintomaService.findAll());
    }

    // READ BY ID
    @GetMapping("sintomas/{id}")
    public ResponseEntity<Sintoma> buscarPorId(@PathVariable Long id) {
        Sintoma sintoma = sintomaService.findById(id);
        if (sintoma != null) {
            return ResponseEntity.ok(sintoma);
        }
        return ResponseEntity.notFound().build();
    }

    // UPDATE
    @PutMapping("sintomas/{id}")
    public ResponseEntity<Sintoma> actualizar(@PathVariable Long id,
                                              @RequestBody Sintoma sintoma) {
        sintoma.setId(id);
        Sintoma actualizado = sintomaService.actualizar(sintoma);
        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE
    @DeleteMapping("sintomas/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        sintomaService.borrar(id);
        return ResponseEntity.noContent().build();
    }

    // Buscar por nombre
    @GetMapping("sintomas/nombre/{palabra}")
    public ResponseEntity<List<SintomaDTO>> buscarPorNombre(@PathVariable String palabra) {
        return ResponseEntity.ok(sintomaService.buscarPorNombre(palabra));
    }
}
