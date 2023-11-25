package com.module.driveEase.controller.admin;

import com.module.driveEase.domain.admin.Cuenta;
import com.module.driveEase.domain.admin.User;
import com.module.driveEase.repository.admin.CuentaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cuenta/")
public class CuentaController {

    @Autowired
    private CuentaRepo cuentaRepo;

    @CrossOrigin
    @GetMapping(value = "/todocuenta")
    public List<Cuenta> getAllUser(){
        return cuentaRepo.findAll();
    }

    //crear cuenta
    @CrossOrigin
    @PostMapping(value = "/createcuenta")
    public Cuenta createUser(@RequestBody Cuenta cuenta){
        return cuentaRepo.save(cuenta);
    }
}
