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
@Table(name= "creditos")
public class Credito {

    @Id
    @Column
    private Integer id_creditos;
    @Column
    private Integer saldo_creditos;
    @Column
    private Integer fecha_vencimiento;
}
