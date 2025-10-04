package com.salud.appsaludai.security.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
    @Value("${jwt.secret}")
    private String secretKey;

    public String extractUsername(String token) {return extractClaim(token,Claims::getSubject); }

    public Date extractExpiration(String token) {return extractClaim}

    public <T> T extractClaims(String token){
        return Jwts.parser
    }

}
