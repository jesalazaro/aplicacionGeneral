package com.module.driveEase.dto.admin;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CreditoDto {

    private Integer saldo_creditos;
    private Integer fecha_vencimiento;

}
