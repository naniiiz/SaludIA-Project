package com.salud.appsaludai.DTO;

import lombok.*;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class EnfermedadDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Set<Long> idsSintomas;
}
