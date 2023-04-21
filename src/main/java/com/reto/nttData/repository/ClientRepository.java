package com.reto.nttData.repository;

import com.reto.nttData.domain.dto.ReportDTO;
import com.reto.nttData.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long> {
    Client findByClientId(Long id);

}
