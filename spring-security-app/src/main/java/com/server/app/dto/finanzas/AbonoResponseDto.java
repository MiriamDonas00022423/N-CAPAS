package com.server.app.dto.finanzas;

import com.server.app.entities.finanzas.Abono;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

@Getter
@Setter
public class AbonoResponseDto {

    private Integer id;
    private BigDecimal monto;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaPago;
    private BigDecimal recargoMora;
    private Integer planPagoId;
    private Integer prestamoId;

    public AbonoResponseDto(Abono abono) {
        this.id = abono.getId();
        this.monto = abono.getMonto();
        this.fechaPago = abono.getFechaPago();
        this.recargoMora = abono.getRecargoMora();
        this.planPagoId = abono.getPlanPago().getId();
        this.prestamoId = abono.getPlanPago().getPrestamo().getId();
    }
}
