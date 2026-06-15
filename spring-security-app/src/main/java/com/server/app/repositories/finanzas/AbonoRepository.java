package com.server.app.repositories.finanzas;

import com.server.app.entities.finanzas.Abono;
import com.server.app.entities.finanzas.PlanPago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbonoRepository extends JpaRepository<Abono, Integer> {

    List<Abono> findByPlanPago(PlanPago planPago);
}
