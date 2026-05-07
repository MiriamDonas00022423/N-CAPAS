package com.example.elsistemadelossietemares.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "pirates")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pirate {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "bounty", nullable = false)
    private Double bounty;

    @Column(name = "crew", nullable = false)
    private String crew;

    @Column(name = "is_alive", nullable = false)
    private Boolean isAlive;

}
