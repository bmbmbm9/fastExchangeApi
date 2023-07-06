package com.fastexchange.myfastexchange.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "exchanges")
public class Exchanges {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "selectedCryptocoin1")
    private String selectedCryptocoin1;

    @Column(name = "sum1")
    private String sum1;

    @Column(name = "selectedCryptocoin2")
    private String selectedCryptocoin2;

    @Column(name = "sum2")
    private String sum2;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "exchangeTime")
    private LocalDateTime exchangeTime;

    public Exchanges(String selectedCryptocoin1, String sum1, String selectedCryptocoin2, String sum2, String email, String address, LocalDateTime exchangeTime){
        this.selectedCryptocoin1 = selectedCryptocoin1;
        this.sum1 = sum1;
        this.selectedCryptocoin2 = selectedCryptocoin2;
        this.sum2 = sum2;
        this.email = email;
        this.address = address;
        this.exchangeTime = exchangeTime;
    }
}
