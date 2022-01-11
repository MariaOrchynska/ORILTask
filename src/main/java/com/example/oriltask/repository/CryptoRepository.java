package com.example.oriltask.repository;
import model.ModelCrypto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoRepository extends JpaRepository<ModelCrypto,Long> {
    @Override
    <S extends ModelCrypto> S save(S entity);

}
