package com.module.driveEase.controller;

import com.module.driveEase.domain.Alquilar;
import com.module.driveEase.domain.Car;
import com.module.driveEase.repository.vehiculos.AlquiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/alquilar/")
public class AlquiController {

    @Autowired
    private AlquiRepository alquiRepository;

    @CrossOrigin
    @GetMapping(value = "/alquilarxid/{id_usuario}")
    public List<Alquilar> getAlquilarxidUsu(@PathVariable Integer id_usuario){
        return  alquiRepository.findByUsuario(id_usuario)  ;
    }

    @CrossOrigin
    @PostMapping(value = "/alquilarsave")
    public Alquilar saveAlquilar(@RequestBody Alquilar alquilar){
        return  alquiRepository.save(alquilar);
    }


}
