package com.example.censohyrule.service;


import com.example.censohyrule.domain.entity.Material;
import com.example.censohyrule.domain.entity.Rarity;
import com.example.censohyrule.repository.MaterialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MaterialService {
    private final MaterialRepository repository;

    public List<Material> obtenerTodos() {
        return repository.findAll();
    }

    public List<Material> obtenerOrdenadosPorPrecioDesc() {
        return repository.findAll()
                .stream()
                .sorted((a, b) -> Double.compare(b.getPrecioVenta(), a.getPrecioVenta()))
                .toList();
    }

    public Optional<Material> obtenerMasCaro() {
        return repository.findAll()
                .stream()
                .max((a, b) -> Double.compare(a.getPrecioVenta(), b.getPrecioVenta()));
    }

    public List<Material> obtenerLegendarios() {
        return repository.findAll()
                .stream()
                .filter(m -> m.getRareza() == Rarity.LEGENDARIO)
                .toList();
    }

    public List<String> obtenerUbicacionesUnicas() {
        return repository.findAll()
                .stream()
                .map(Material::getUbicacionPrincipal)
                .distinct()
                .toList();
    }

}
