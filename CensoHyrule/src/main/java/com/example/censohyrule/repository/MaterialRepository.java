package com.example.censohyrule.repository;


import com.example.censohyrule.common.MaterialList;
import com.example.censohyrule.domain.entity.Material;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MaterialRepository {
    private final MaterialList materialList;
    public List<Material> findAll() {
        return materialList.getMateriales();
    }
}
