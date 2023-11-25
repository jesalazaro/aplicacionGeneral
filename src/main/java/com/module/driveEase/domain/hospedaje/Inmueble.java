package com.module.driveEase.domain.hospedaje;

import com.module.driveEase.domain.Ciudad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="inmueble")
@Getter
@Setter
@AllArgsConstructor
public class Inmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_inmueble;
    @Column
    private String direccion;
    @Column
    private String tipo_propiedad;
    @Column
    private Integer numero_habitaciones;
    @Column
    private Integer numero_banos;
    @Column
    private Integer numero_cuenta;
    @Column
    private Integer id_usuario;
    @Column
    private double valor_noche;
    @Column
    private Integer disponible;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudad;

    public Inmueble() {

    }
}
