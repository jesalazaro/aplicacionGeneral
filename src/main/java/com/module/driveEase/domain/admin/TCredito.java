package com.module.driveEase.domain.admin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tarjeta_credito")
public class TCredito {

    @Id
    @Column
    private Integer numero_tarjeta;
    @Column
    private String nombre_titular_tarjeta;
    @Column
    private Integer identificacion_titular_tarjeta;
    @Column
    private String fecha_vencimiento;
    @Column
    private Integer codigo_cvv;
    @Column
    private double cupo_tarjeta;

    public TCredito(){

    }

}
