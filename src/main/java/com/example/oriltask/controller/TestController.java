package com.example.oriltask.controller;

import com.example.oriltask.dto.CryptoDTO;
import com.example.oriltask.repository.CryptoRepository;
import com.example.oriltask.service.CryptoService;
import model.ModelCrypto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@Controller
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


    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok(cryptoService.findAllCryptos());
    }


    @GetMapping("/list")
    public ResponseEntity <List<ModelCrypto>>list() {
        return ResponseEntity.ok(cryptoRepository.findAll());
    }

    @RequestMapping(value="/find/{lastPrise}",method = RequestMethod.GET)
    public ResponseEntity<List<ModelCrypto>>getByFirstName(@PathVariable("lastPrize") Double lastPrise) {
        return ResponseEntity.ok(cryptoService.findAllBy()) ;
    }










}







