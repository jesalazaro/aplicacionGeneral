package com.module.driveEase.repository.admin;

import com.module.driveEase.domain.admin.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepo extends JpaRepository<Cuenta, Integer> {

}
