package com.server.app.dto.finanzas;

import com.server.app.entities.finanzas.EstadoPlanPago;
import com.server.app.entities.finanzas.PlanPago;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class PlanPagoResponseDto {

    private Integer id;
    private Integer numeroCuota;
    private BigDecimal montoCapital;
    private BigDecimal montoInteres;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaVencimiento;
    private EstadoPlanPago estado;

    public PlanPagoResponseDto(PlanPago planPago) {
        this.id = planPago.getId();
        this.numeroCuota = planPago.getNumeroCuota();
        this.montoCapital = planPago.getMontoCapital();
        this.montoInteres = planPago.getMontoInteres();
        this.fechaVencimiento = planPago.getFechaVencimiento();
        this.estado = planPago.getEstado();
    }
}
