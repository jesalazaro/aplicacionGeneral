package com.module.driveEase.controller;


import com.module.driveEase.domain.Alquilar;
import com.module.driveEase.domain.Car;
import com.module.driveEase.repository.vehiculos.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/api/vehiculos/")
public class CarController {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CarRepository carRepository;

    @CrossOrigin
    @GetMapping(value = "/todovehiculos")
    public List<Car> getAllCar(){
        return carRepository.findAll();
    }

    @CrossOrigin
    @GetMapping(value = "/vehiculosxid/{id_vehiculo}")
    public Optional<Car> carById(@PathVariable int id_vehiculo){
        return carRepository.findById(id_vehiculo);
    }

    @CrossOrigin
    @GetMapping(value = "/vehiculosdispo")
    public List<Car> getAllCardispo(){
        return carRepository.findByDisponible(1);
    }

    @CrossOrigin
    @PostMapping(value = "/createCar")
    public Car createCar(@RequestBody Car car){
        return carRepository.save(car);
    }

    @CrossOrigin
    @GetMapping(value ="/buscarxciudad/{id_ciudad}")
    public List<Car> getCarbyCiudad(@PathVariable Integer id_ciudad){
        return carRepository.findByCiudad(id_ciudad);
    };

    @CrossOrigin
    @GetMapping(value ="/execupago/{medio_pago}/{valor_total}/{id_comprador}/{id_vehiculo}")
    public Integer executPay(@PathVariable Integer medio_pago, @PathVariable double valor_total,
                             @PathVariable Integer id_comprador,@PathVariable Integer id_vehiculo){
        return carRepository.executePay(medio_pago,valor_total,id_comprador,id_vehiculo);
    }

}
