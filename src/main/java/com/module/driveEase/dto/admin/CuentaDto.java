package com.module.driveEase.dto.admin;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CuentaDto {

    private Integer numero_cuenta;
    private String nombre_titular_cuenta;
    private String identificacion_titular_cuenta;
    private double saldo_cuenta;
}
