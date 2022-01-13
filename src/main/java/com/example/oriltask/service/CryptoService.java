package com.example.oriltask.service;

import com.example.oriltask.dto.CryptoDTO;
import com.example.oriltask.repository.CryptoRepository;
import model.ModelCrypto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;


@Service

public class CryptoService {
    @Autowired
    private CryptoRepository cryptoRepository;

    public List<CryptoDTO> findAllCryptos() {
        List<CryptoDTO> list = cryptoRepository.findAll().stream()
                .map(e -> {
                    CryptoDTO cryptoDTO = new CryptoDTO();
                    cryptoDTO.setCryptoIdDTO(e.getId());
                    cryptoDTO.setCurrencyFirstName(e.getCurrencyFirstName());
                    cryptoDTO.setCurrencySecondName(e.getCurrencySecondName());
                    cryptoDTO.setCurrencyName(e.getCurrencyName());
                    cryptoDTO.setLastPrice(e.getLastPrice());
                    return cryptoDTO;
                }).collect(Collectors.toList());
        return list;
    }

    public List<CryptoDTO> findAllSortedPrize() {
        List<CryptoDTO> list = cryptoRepository.sortByPrize().stream()
                .map(e -> {
                    CryptoDTO cryptoDTO = new CryptoDTO();
                    cryptoDTO.setCurrencyFirstName(e.getCurrencyFirstName());
                    cryptoDTO.setCurrencySecondName(e.getCurrencySecondName());
                    cryptoDTO.setCurrencyName(e.getCurrencyName());
                    cryptoDTO.setLastPrice(e.getLastPrice());
                    return cryptoDTO;
                }).collect(Collectors.toList());

        return list;
    }

}


