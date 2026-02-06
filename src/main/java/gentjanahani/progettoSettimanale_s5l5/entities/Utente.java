package gentjanahani.progettoSettimanale_s5l5.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.service.UnknownUnwrapTypeException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "UTENTE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Utente {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID idUtente;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "nome_utente", nullable = false)
    private String nome;
    @Column(name = "e_mail", nullable = false)
    private String eMail;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazioni> prenotazioni = new ArrayList<>();

    @Override
    public String toString() {
        return "Utente{" +
                "idUtente=" + idUtente +
                ", userName='" + userName + '\'' +
                ", nome='" + nome + '\'' +
                ", eMail='" + eMail + '\'' +
//                ", prenotazioni=" + prenotazioni +
                '}';
    }
}
