package com.ricardo.fipeapi.repository;

import com.ricardo.fipeapi.entity.HistoricoConsulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoRepository extends JpaRepository<HistoricoConsulta, Long> {
}
