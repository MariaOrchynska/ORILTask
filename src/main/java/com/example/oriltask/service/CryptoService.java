package com.example.oriltask.service;

import com.example.oriltask.repository.CryptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CryptoService {
    @Autowired
    CryptoRepository cryptoRepository;

}


