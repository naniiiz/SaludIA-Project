package com.salud.appsaludai.Security.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@lombok.Data
public class UserSecurityDTO {
    private String jwt;
    private Set<String> roles;
}
