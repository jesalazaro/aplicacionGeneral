package com.module.driveEase.controller.admin;


import com.module.driveEase.domain.admin.User;
import com.module.driveEase.repository.admin.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios/")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    //traer todos los usuarios
    @CrossOrigin
    @GetMapping(value = "/todous")
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    //crear usuario
    @CrossOrigin
    @PostMapping(value = "/createus")
    public User createUser(@RequestBody User user){
        return userRepo.save(user);
    }


    //Buscar usuario y contraseña
    @CrossOrigin
    @GetMapping(value = "/buscarusu/{email}/{password}")
    public Optional<User> login(@PathVariable String email,@PathVariable String password){
        Optional<User> usuario = userRepo.findByEmail(email);
        String contrasena = usuario.get().getPassword();
        if ( contrasena.equals(password)) {
            return usuario;
        }
        return null;
    }
}
