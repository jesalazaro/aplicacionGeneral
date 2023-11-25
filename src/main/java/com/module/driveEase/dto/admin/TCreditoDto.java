package com.module.driveEase.dto.admin;

import com.module.driveEase.domain.admin.TCredito;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TCreditoDto {

    private Integer numero_tarjeta;
    private String nombre_titular_tarjeta;
    private Integer identificacion_titular_tarjeta;
    private String fecha_vencimiento;
    private Integer codigo_cvv;
    private double cupo_tarjeta;

}
