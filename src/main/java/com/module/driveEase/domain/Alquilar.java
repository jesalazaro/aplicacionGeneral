package com.module.driveEase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "alquilar")
@Getter
@Setter
@AllArgsConstructor
public class Alquilar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private Integer id_usuario;
    @Column
    private Integer id_vehiculo;
    @Column
    private Integer numero_tarjeta;
    @Column
    private Date fecha_inicio;
    @Column
    private Date fecha_fin;

    public Alquilar() {

    }
}
