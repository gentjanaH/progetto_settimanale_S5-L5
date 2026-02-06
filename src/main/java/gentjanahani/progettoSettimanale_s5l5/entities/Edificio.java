package gentjanahani.progettoSettimanale_s5l5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "EDIFICIO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Edificio {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID idEdificio;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "indirizzo", nullable = false)
    private String indirizzo;
    @Column(name = "città", nullable = false)
    private String citta;

    //relazione one to many con prenotazione
    @OneToMany(mappedBy = "edificio")
    private List<PostazioneAziendale> postazione = new ArrayList<>();

    @Override
    public String toString() {
        return "Edificio{" +
                "idEdificio=" + idEdificio +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'' +
//                ", postazione=" + postazione +
                '}';
    }
}
