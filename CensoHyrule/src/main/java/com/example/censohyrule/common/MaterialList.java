package com.example.censohyrule.common;


import com.example.censohyrule.domain.entity.Category;
import com.example.censohyrule.domain.entity.Effect;
import com.example.censohyrule.domain.entity.Material;
import com.example.censohyrule.domain.entity.Rarity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialList {
    private final List<Material> materials;

    public MaterialList() {
        this.materials = new ArrayList<>();

        materials.add(Material.builder()
                .nombre("Ámbar Rojo")
                .categoria(Category.MINERAL)
                .efecto(Effect.DEFENSA)
                .precioVenta(30)
                .ubicacionPrincipal("Cordillera de Hebra")
                .rareza(Rarity.RARO)
                .build());

        materials.add(Material.builder()
                .nombre("Ala de Keese")
                .categoria(Category.PARTE_DE_MONSTRUO)
                .efecto(Effect.SIGILO)
                .precioVenta(15)
                .ubicacionPrincipal("Pradera de Hyrule")
                .rareza(Rarity.COMUN)
                .build());

        materials.add(Material.builder()
                .nombre("Pimienta Ardiente")
                .categoria(Category.PLANTA)
                .efecto(Effect.ATAQUE)
                .precioVenta(10)
                .ubicacionPrincipal("Cordillera de Hebra")
                .rareza(Rarity.POCO_COMUN)
                .build());

        materials.add(Material.builder()
                .nombre("Trufa Grandiosa")
                .categoria(Category.COMIDA)
                .efecto(Effect.CORAZONES)
                .precioVenta(100)
                .ubicacionPrincipal("Bosque de Farone")
                .rareza(Rarity.LEGENDARIO)
                .build());
    }

    public List<Material> getMateriales() {
        return materials;
    }


}
