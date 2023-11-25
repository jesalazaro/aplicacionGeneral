package com.module.driveEase.controller.admin;

import com.module.driveEase.domain.admin.Cuenta;
import com.module.driveEase.domain.admin.TCredito;
import com.module.driveEase.repository.admin.CuentaRepo;
import com.module.driveEase.repository.admin.TCreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tcredito/")
public class TCreditoController {

    @Autowired
    private TCreRepo tCreRepo;

    @CrossOrigin
    @GetMapping(value = "/todotcredito")
    public List<TCredito> getAllUser(){
        return tCreRepo.findAll();
    }

    //crear usuario
    @CrossOrigin
    @PostMapping(value = "/createtcredito")
    public TCredito createUser(@RequestBody TCredito tCredito){
        return tCreRepo.save(tCredito);
    }
}
