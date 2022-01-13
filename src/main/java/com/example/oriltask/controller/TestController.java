package com.example.oriltask.controller;

import com.example.oriltask.dto.CryptoDTO;
import com.example.oriltask.repository.CryptoRepository;
import com.example.oriltask.service.CryptoService;
import model.ModelCrypto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/cryptos")
public class TestController {
    @Autowired
    CryptoService cryptoService;
    @Autowired
    CryptoRepository cryptoRepository;

    @GetMapping("/")
    public String welcome() {
        return "<html><body>"
                + "<h1>WELCOME</h1>"
                + "</body></html>";
    }

    @GetMapping("/list")
    public ResponseEntity<List<CryptoDTO>> list() {
        return ResponseEntity.ok(cryptoService.findAllCryptos());
    }

    @GetMapping("/sortedNormally")
    public ResponseEntity<List<CryptoDTO>> sortedByPrize() {
        return ResponseEntity.ok(cryptoService.findAllSortedPrize());
    }


    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public ResponseEntity<ModelCrypto> id(@PathVariable("id") Long id) {
        return ResponseEntity.ok(cryptoRepository.getById(id));
    }
}







