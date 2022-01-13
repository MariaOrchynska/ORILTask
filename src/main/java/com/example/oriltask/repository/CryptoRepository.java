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
public interface CryptoRepository extends JpaRepository<ModelCrypto, Long> {

    List<ModelCrypto> sortByPrize();


}
