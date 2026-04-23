package com.example.censohyrule.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Material {
    private String nombre;
    private Category categoria;
    private Effect efecto;
    private int precioVenta;
    private String ubicacionPrincipal;
    private Rarity rareza;
}
