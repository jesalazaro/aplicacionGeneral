package com.module.driveEase.controller.hospedaje;

import com.module.driveEase.domain.Car;
import com.module.driveEase.domain.hospedaje.Inmueble;
import com.module.driveEase.repository.hospedaje.InmuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hospedaje/")
public class InmuebleController {

    @Autowired
    private InmuRepository inmuRepository;

    @CrossOrigin
    @GetMapping(value = "/todoinmu")
    public List<Inmueble> getAllInmu(){
        return inmuRepository.findAll();
    }

    @CrossOrigin
    @PostMapping(value = "/createinmu")
    public Inmueble createInmu(@RequestBody Inmueble inmueble){
        return inmuRepository.save(inmueble);
    }

}
