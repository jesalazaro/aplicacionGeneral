package com.module.driveEase.repository.vehiculos;

import com.module.driveEase.domain.Alquilar;
import com.module.driveEase.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

        @Query(value = "select v.id_vehiculo," +
                "marca," +
                "modelo," +
                "numero_placa," +
                "kilometraje," +
                "tipo_vehiculo,numero_cuenta,id_usuario,precio_dia,disponible,v.id_ciudad " +
                "from basedatosStayHub.dbo.vehiculos as v " +
                "where v.id_ciudad = :id_ciudad", nativeQuery = true)
        public List<Car> findByCiudad(@Param("id_ciudad") Integer id_ciudad);

        @Query(value = "DECLARE @return_value int EXEC @return_value = basedatosStayHub.dbo.sp_generacionPagoCarros " +
                "@medioPago = :medio_pago," +
                "@valor_total = :valor_total," +
                "@id_comprador = :id_comprador," +
                "@id_vehiculo = :id_vehiculo " +
                "SELECT 'Return Value' = @return_value", nativeQuery = true)
        public Integer executePay(@Param("medio_pago") Integer medio_pago,@Param("valor_total") double valor_total,
                                  @Param("id_comprador") Integer id_comprador,
                                  @Param("id_vehiculo") Integer id_vehiculo);

        List<Car> findByDisponible(Integer disponible);




}
