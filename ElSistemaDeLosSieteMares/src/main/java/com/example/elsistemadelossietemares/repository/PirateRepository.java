package com.example.elsistemadelossietemares.repository;

import com.example.elsistemadelossietemares.domain.entity.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, UUID> {

}
