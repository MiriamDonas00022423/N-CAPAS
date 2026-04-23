package com.example.censohyrule;

import com.example.censohyrule.domain.entity.Category;
import com.example.censohyrule.domain.entity.Material;
import com.example.censohyrule.service.MaterialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.example.censohyrule.domain.entity.Category.*;

@SpringBootApplication
public class CensoHyruleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CensoHyruleApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(MaterialService materialService) {
        return args -> {

            System.out.println("=== CATÁLOGO COMPLETO ===");
            materialService.obtenerTodos().forEach(this::imprimirMaterial);

            System.out.println("\n=== MATERIALES ORDENADOS DE MAYOR A MENOR PRECIO ===");
            materialService.obtenerOrdenadosPorPrecioDesc()
                    .forEach(this::imprimirMaterial);

            System.out.println("\n=== MATERIAL MÁS CARO ===");
            materialService.obtenerMasCaro()
                    .ifPresent(this::imprimirMaterial);

            System.out.println("\n=== MATERIALES LEGENDARIOS ===");
            materialService.obtenerLegendarios()
                    .forEach(this::imprimirMaterial);

            System.out.println("\n=== UBICACIONES SIN REPETIR ===");
            materialService.obtenerUbicacionesUnicas()
                    .forEach(ubicacion ->
                            System.out.println("[HYRULE-DB] Ubicación: " + ubicacion)
                    );
        };
    }

    private void imprimirMaterial(Material material) {
        System.out.println("[HYRULE-DB] Nombre: " + material.getNombre()
                + " | Categoría: " + formatearCategoria(material.getCategoria())
                + " | Precio: " + material.getPrecioVenta() + " Rupias");
    }

    private String formatearCategoria(Category categoria) {
        return switch (categoria) {
            case COMIDA -> "Comida";
            case MINERAL -> "Mineral";
            case PARTE_DE_MONSTRUO -> "Parte de Monstruo";
            case PLANTA -> "Planta";
        };
    }

}
