package com.salud.appsaludai.Controllers;

import com.salud.appsaludai.DTO.UbicacionDTO;
import com.salud.appsaludai.Entidades.Ubicacion;
import com.salud.appsaludai.Interfaces.IUbicacionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/")
public class UbicacionController {
    @Autowired
    private IUbicacionServices ubicacionService;

    // CREATE
    @PostMapping("ubicaciones")
    public ResponseEntity<UbicacionDTO> registrar(@RequestBody UbicacionDTO ubicacionDTO) {
        return ResponseEntity.ok(ubicacionService.registrar(ubicacionDTO));
    }

    // READ ALL
    @GetMapping("ubicaciones")
    public ResponseEntity<List<UbicacionDTO>> listar() {
        return ResponseEntity.ok(ubicacionService.findAll());
    }

    // READ BY ID
    @GetMapping("ubicaciones/{id}")
    public ResponseEntity<Ubicacion> buscarPorId(@PathVariable Long id) {
        Ubicacion ubicacion = ubicacionService.findById(id);
        if (ubicacion != null) {
            return ResponseEntity.ok(ubicacion);
        }
        return ResponseEntity.notFound().build();
    }

    // UPDATE
    @PutMapping("ubicaciones/{id}")
    public ResponseEntity<Ubicacion> actualizar(@PathVariable Long id,
                                                @RequestBody Ubicacion ubicacion) {
        ubicacion.setId(id);
        Ubicacion actualizado = ubicacionService.actualizar(ubicacion);
        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE
    @DeleteMapping("ubicaciones/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        ubicacionService.borrar(id);
        return ResponseEntity.noContent().build();
    }
}
