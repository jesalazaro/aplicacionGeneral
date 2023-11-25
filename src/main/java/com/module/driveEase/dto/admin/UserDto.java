package com.module.driveEase.dto.admin;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Date;

@Data
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private String nom_usuario;
    private Date fecha_nacimiento;
    private BigInteger telefono_usuario;
    private Integer numero_cuenta;
    private Integer numero_tarjeta;
    private String email;
    private String password;
}
