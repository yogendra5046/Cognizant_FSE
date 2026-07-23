package com.cognizant.jwt_handson.controller;
import com.cognizant.jwt_handson.model.AuthenticationRequest;
import com.cognizant.jwt_handson.util.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody AuthenticationRequest request) {

        if ("admin".equals(request.getUsername())
                && "admin".equals(request.getPassword())) {

            return jwtUtil.generateToken(request.getUsername());
        }

        return "Invalid Credentials";
    }
}