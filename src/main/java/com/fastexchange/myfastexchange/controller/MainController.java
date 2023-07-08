package com.fastexchange.myfastexchange.controller;

import com.fastexchange.myfastexchange.model.Exchanges;
import com.fastexchange.myfastexchange.repository.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@CrossOrigin(origins = "https://fastexchange365.com")
@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    ExchangeRepository exchangeRepository;

    @PostMapping("/exchanges")
    public ResponseEntity<Exchanges> createExchange(@RequestBody Exchanges exchange) {
        try {
            Exchanges _tutorial = exchangeRepository
                    .save(new Exchanges(exchange.getSelectedCryptocoin1(), exchange.getSum1(), exchange.getSelectedCryptocoin2(), exchange.getSum2(), exchange.getEmail(), exchange.getAddress(), LocalDateTime.now()));
            return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
