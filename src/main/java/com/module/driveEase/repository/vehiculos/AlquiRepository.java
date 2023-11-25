package com.module.driveEase.repository.vehiculos;


import com.module.driveEase.domain.Alquilar;
import com.module.driveEase.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlquiRepository extends JpaRepository <Alquilar, Integer> {


    @Query(value = "select " +
            "id,id_usuario," +
            "id_vehiculo," +
            "numero_tarjeta," +
            "fecha_inicio," +
            "fecha_fin " +
            "from basedatosStayHub.dbo.alquilar as u " +
            "where u.id_usuario = :id_usuario", nativeQuery = true)
    public List<Alquilar> findByUsuario(@Param("id_usuario") Integer id_usuario);
}
