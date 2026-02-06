package gentjanahani.progettoSettimanale_s5l5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "POSTAZIONE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostazioneAziendale {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID idPostazione;
    @Column(name = "descrizione", nullable = false)
    private String descrizione;
    @Column(name = "tipo_postazione", nullable = false)
    private TipoPostazione tipoPostazione;
    @Column(name = "capienza_massima", nullable = false)
    private int capienzaMassima;

    //relazione many to one con edificio
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    //relazione one to many con prenotazione
    @OneToMany(mappedBy = "postazione")
    private List<Prenotazioni> prenotazioni = new ArrayList<>();

    @Override
    public String toString() {
        return "PostazioneAziendale{" +
                "idPostazione=" + idPostazione +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", capienzaMassima=" + capienzaMassima +
                ", edificio=" + edificio +
                ", prenotazioni=" + prenotazioni +
                '}';
    }
}
