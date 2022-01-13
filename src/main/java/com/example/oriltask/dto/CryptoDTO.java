package com.example.oriltask.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
public class CryptoDTO {
    private long CryptoIdDTO;
    private String CurrencyName;
    private String CurrencyFirstName;
    private String CurrencySecondName;
    private double lastPrice;
}
