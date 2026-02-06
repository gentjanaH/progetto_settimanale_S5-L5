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
@NoArgsConstructor
public class PostazioneAziendale {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID idPostazione;
    @Column(name = "descrizione", nullable = false)
    private String descrizione;
    @Column(name = "tipo_postazione", nullable = false)
    @Enumerated(EnumType.STRING)
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

    public PostazioneAziendale(String descrizione, TipoPostazione tipoPostazione, int capienzaMassima) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.capienzaMassima = capienzaMassima;

    }

    public PostazioneAziendale(String descrizione, TipoPostazione tipoPostazione, int capienzaMassima, Edificio edificio) {

        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.capienzaMassima = capienzaMassima;
        this.edificio = edificio;
    }

    @Override
    public String toString() {
        return "PostazioneAziendale{" +
                "idPostazione=" + idPostazione +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", capienzaMassima=" + capienzaMassima +
                ", edificio=" + edificio +
//                ", prenotazioni=" + prenotazioni +
                '}';
    }
}
