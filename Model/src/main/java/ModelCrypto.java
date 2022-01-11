import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Currency")
public class ModelCrypto {
    @Id
    @Column(name = "CryptoId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    long lastPrice;
}
