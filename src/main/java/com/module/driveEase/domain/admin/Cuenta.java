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
@Table(name = "cuenta_bancaria")
public class Cuenta {

    @Id
    @Column
    private Integer numero_cuenta;
    @Column
    private String nombre_titular_cuenta;
    @Column
    private String identificacion_titular_cuenta;
    @Column
    private double saldo_cuenta;

    public Cuenta(){

    }
}
