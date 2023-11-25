package com.module.driveEase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ciudad")
@Getter
@Setter
@AllArgsConstructor
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ciudad;
    @Column
    private String nombre_ciudad;
    @Column
    private String pais;


    public Ciudad() {

    }
}
