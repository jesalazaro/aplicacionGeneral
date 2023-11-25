package com.module.driveEase.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "vehiculos")
@Getter
@Setter
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_vehiculo;

    @Column
    private String marca;

    @Column
    private String modelo;

    @Column
    private String numero_placa;

    @Column
    private Integer kilometraje;

    @Column
    private String tipo_vehiculo;

    @Column
    private  Integer numero_cuenta;

    @Column
    private  Integer id_usuario;

    @Column
    private  double precio_dia;

    @Column
    private  Integer disponible;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudad;

    public Car() {

    }
}
