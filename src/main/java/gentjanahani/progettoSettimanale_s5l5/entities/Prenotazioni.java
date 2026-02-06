package gentjanahani.progettoSettimanale_s5l5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "PRENOTAZIONI")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazioni {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID idPrenotazione;

    @Column(name = "data", nullable = false)
    private LocalDate dataPrenotazione;

    //relazione postazione

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private PostazioneAziendale postazione;

    //relazione utente
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    @Override
    public String toString() {
        return "Prenotazioni{" +
                "idPrenotazione=" + idPrenotazione +
                ", dataPrenotazione=" + dataPrenotazione +
//                ", postazione=" + postazione +
//                ", utente=" + utente +
                '}';
    }
}
