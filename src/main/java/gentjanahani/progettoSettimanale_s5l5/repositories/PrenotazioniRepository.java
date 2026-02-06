package gentjanahani.progettoSettimanale_s5l5.repositories;

import gentjanahani.progettoSettimanale_s5l5.entities.PostazioneAziendale;
import gentjanahani.progettoSettimanale_s5l5.entities.Prenotazioni;
import gentjanahani.progettoSettimanale_s5l5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.UUID;

@Repository
public interface PrenotazioniRepository extends JpaRepository<Prenotazioni, UUID> {

    boolean existsByDataPrenotazioneAndPostazione(LocalDate dataPrenotazione, PostazioneAziendale postazione);

    boolean existsByDataPrenotazioneAndUtente(LocalDate dataPrenotazione, Utente utente);
}
