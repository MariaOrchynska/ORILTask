package com.example.oriltask.repository;

import model.ModelCrypto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<ModelCrypto,Long> {
}
