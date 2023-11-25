package com.module.driveEase.dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CarDto {

    private int id_vehiculo;
    private String marca;
    private String modelo;
    private String numero_placa;
    private Integer kilometraje;
    private String tipo_vehiculo;
    private  Integer kmTraveled;
    private  Integer numero_cuenta;
    private  Integer id_usuario;
    private  double precio_dia;

}