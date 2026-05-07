package com.example.elsistemadelossietemares.service.impl;

import com.example.elsistemadelossietemares.domain.entity.Pirate;
import com.example.elsistemadelossietemares.repository.PirateRepository;
import com.example.elsistemadelossietemares.service.PirateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PrivateServiceImpl implements PirateService {

    private final PirateRepository pirateRepository;

    @Override
    public Pirate createPirate(Pirate pirate) {
        return pirateRepository.save(pirate);
    }

    @Override
    public List<Pirate> getAllPirates() {
        return pirateRepository.findAll();
    }

    @Override
    public Pirate getPirateById(UUID id) {
        return pirateRepository.findById(id).orElseThrow();
    }

    @Override
    public Pirate updatePirate(UUID id, Pirate pirate) {
        Pirate existingPirate = pirateRepository.findById(id).orElseThrow();

        existingPirate.setName(pirate.getName());
        existingPirate.setBounty(pirate.getBounty());
        existingPirate.setCrew(pirate.getCrew());
        existingPirate.setIsAlive(pirate.getIsAlive());

        return pirateRepository.save(existingPirate);
    }

    @Override
    public void deletePirate(UUID id) {
        Pirate existingPirate = pirateRepository.findById(id).orElseThrow();
        pirateRepository.delete(existingPirate);
    }
}
