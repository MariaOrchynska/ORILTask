package com.example.oriltask.repository;

import model.ModelCrypto;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Function;
@Repository

public interface CryptoRepository extends JpaRepository<ModelCrypto,Long> {


    ModelCrypto findById(long id);

    @Override
    List<ModelCrypto> findAll();
    List<ModelCrypto>findByFirstName(String firstName);


    @Query("SELECT e FROM cryptocurrency e WHERE e.lastprize > ?1 ORDER BY e.lastPrize DESC")
    List<ModelCrypto> findBySalaryGreaterThanJPQL(double salary);
}
