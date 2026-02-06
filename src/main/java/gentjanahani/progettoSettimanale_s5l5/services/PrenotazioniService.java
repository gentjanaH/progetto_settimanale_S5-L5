package gentjanahani.progettoSettimanale_s5l5.services;

import gentjanahani.progettoSettimanale_s5l5.entities.PostazioneAziendale;
import gentjanahani.progettoSettimanale_s5l5.entities.Prenotazioni;
import gentjanahani.progettoSettimanale_s5l5.entities.Utente;
import gentjanahani.progettoSettimanale_s5l5.exceptions.PostazioneOccupataException;
import gentjanahani.progettoSettimanale_s5l5.repositories.PrenotazioniRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class PrenotazioniService {
    private final PrenotazioniRepository prenotazioniRepository;

    @Autowired
    public PrenotazioniService(PrenotazioniRepository prenotazioniRepository) {
        this.prenotazioniRepository = prenotazioniRepository;
    }

    public Prenotazioni createAndSavePrenotazione(LocalDate data, PostazioneAziendale location, Utente utente) {

        boolean occupata = prenotazioniRepository.existsByDataPrenotazioneAndPostazione(data, location);
        boolean giaImpegnato = prenotazioniRepository.existsByDataPrenotazioneAndUtente(data, utente);

        if (occupata || giaImpegnato) {
            throw new PostazioneOccupataException();
        }

        Prenotazioni prenotazione = new Prenotazioni(data);
        prenotazione.setPostazione(location);
        prenotazione.setUtente(utente);

        Prenotazioni reservationSaved = prenotazioniRepository.save(prenotazione);
        log.info("Prenotazione {} salvata con successo!", prenotazione.getIdPrenotazione());
        return reservationSaved;
    }
}
