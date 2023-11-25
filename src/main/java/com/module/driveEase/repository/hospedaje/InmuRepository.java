package com.module.driveEase.repository.hospedaje;

import com.module.driveEase.domain.hospedaje.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InmuRepository extends JpaRepository<Inmueble, Integer> {
}
