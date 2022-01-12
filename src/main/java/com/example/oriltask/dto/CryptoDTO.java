package com.example.oriltask.dto;

import lombok.Data;

@Data
public class CryptoDTO {
    private long CryptoIdDTO;
    private String CurrencyName;
    private String CurrencyFirstName;
    private String CurrencySecondName;
    private double lastPrice;
}
