package com.module.driveEase.controller;

import com.module.driveEase.domain.Ciudad;
import com.module.driveEase.repository.vehiculos.Ciudadrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ciudad/")
public class CiudadController {

    @Autowired
    private Ciudadrepository ciudadrepository;

    @CrossOrigin
    @GetMapping(value = "/todasciudades")
    List<Ciudad> getAllciudad(){
        return ciudadrepository.findAll();
    }

}
