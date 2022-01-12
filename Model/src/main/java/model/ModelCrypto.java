package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Currency")
public class ModelCrypto {


    @Id
    @Column(name = "CryptoId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    public ModelCrypto(long id, String currencyName, String currencyFirstName, String currencySecondName, double lastPrice) {
        this.id = id;
        CurrencyName = currencyName;
        CurrencyFirstName = currencyFirstName;
        CurrencySecondName = currencySecondName;
        this.lastPrice = lastPrice;
    }

    @Column(name = "CurrencyName", nullable = false)
    String CurrencyName;
    @Column(name = "CurrencyFirstName", nullable = false)
    String CurrencyFirstName;
    @Column(name = "CurrencySecondName", nullable = false)
    String CurrencySecondName;

    @Column(name = "lastPrice", nullable = false)
    double lastPrice;
}
