package com.server.app.repositories.finanzas;

import com.server.app.entities.User;
import com.server.app.entities.finanzas.Prestamo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

    Page<Prestamo> findByUsuario(User usuario, Pageable pageable);

    List<Prestamo> findByUsuario(User usuario);
}
