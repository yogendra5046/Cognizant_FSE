package com.cognizant.jwt_handson.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

public class JwtUtil {

    // 32+ characters (256 bits)
    private static final String SECRET_KEY =
            "mysecretkeymysecretkeymysecretkey12";

    private final Key key = Keys.hmacShaKeyFor(
            SECRET_KEY.getBytes(StandardCharsets.UTF_8));

    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}