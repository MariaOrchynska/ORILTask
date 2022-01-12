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
    @Column(name = "CryptoName", nullable = false)
    String name;
    @Column(name = "lastPrice", nullable = false)
    long lastPrice;
}
