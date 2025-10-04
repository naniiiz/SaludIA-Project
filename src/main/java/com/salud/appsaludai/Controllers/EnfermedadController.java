package com.salud.appsaludai.Controllers;

import com.salud.appsaludai.DTO.EnfermedadDTO;
import com.salud.appsaludai.Entidades.Enfermedad;
import com.salud.appsaludai.Interfaces.IEnfermedadServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/SaludAI/")
public class EnfermedadController {
    @Autowired
    private IEnfermedadServices enfermedadService;

    // CREATE
    @PostMapping("enfermedades")
    public ResponseEntity<EnfermedadDTO> registrar(@RequestBody EnfermedadDTO enfermedadDTO) {
        return ResponseEntity.ok(enfermedadService.registrar(enfermedadDTO));
    }

    // READ ALL
    @GetMapping("enfermedades")
    public ResponseEntity<List<EnfermedadDTO>> listar() {
        return ResponseEntity.ok(enfermedadService.findAll());
    }

    // READ BY ID
    @GetMapping("enfermedades/{id}")
    public ResponseEntity<Enfermedad> buscarPorId(@PathVariable Long id) {
        Enfermedad enfermedad = enfermedadService.findById(id);
        if (enfermedad != null) {
            return ResponseEntity.ok(enfermedad);
        }
        return ResponseEntity.notFound().build();
    }

    // UPDATE
    @PutMapping("enfermedades/{id}")
    public ResponseEntity<Enfermedad> actualizar(@PathVariable Long id,
                                                 @RequestBody Enfermedad enfermedad) {
        enfermedad.setId(id);
        Enfermedad actualizado = enfermedadService.actualizar(enfermedad);
        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE
    @DeleteMapping("enfermedades/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        enfermedadService.borrar(id);
        return ResponseEntity.noContent().build();
    }

    // Buscar por nombre
    @GetMapping("enfermedades/nombre/{palabra}")
    public ResponseEntity<List<EnfermedadDTO>> buscarPorNombre(@PathVariable String palabra) {
        return ResponseEntity.ok(enfermedadService.buscarPorNombre(palabra));
    }
}
