package com.module.driveEase.domain.admin;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Date;


@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
public class User {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_usuario;
    @Column
    private String nom_usuario;
    @Column
    private Date fecha_nacimiento;
    @Column
    private BigInteger telefono_usuario;
    @Column
    private Integer numero_cuenta;
    @Column
    private Integer numero_tarjeta;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private  String identificacion;

    public User(){

    }
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
