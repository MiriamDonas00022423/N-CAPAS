package com.server.app.repositories.finanzas;

import com.server.app.entities.finanzas.EstadoPlanPago;
import com.server.app.entities.finanzas.PlanPago;
import com.server.app.entities.finanzas.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanPagoRepository extends JpaRepository<PlanPago, Integer> {

    List<PlanPago> findByPrestamoOrderByNumeroCuotaAsc(Prestamo prestamo);

    List<PlanPago> findByPrestamoAndEstadoOrderByNumeroCuotaAsc(Prestamo prestamo, EstadoPlanPago estado);
}
