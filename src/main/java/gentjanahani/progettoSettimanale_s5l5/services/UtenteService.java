package gentjanahani.progettoSettimanale_s5l5.services;

import gentjanahani.progettoSettimanale_s5l5.entities.Edificio;
import gentjanahani.progettoSettimanale_s5l5.entities.Utente;
import gentjanahani.progettoSettimanale_s5l5.exceptions.NotFoundException;
import gentjanahani.progettoSettimanale_s5l5.repositories.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class UtenteService {

    private final UtenteRepository utenteRepository;

    @Autowired
    public UtenteService(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }

    public void saveUtente(Utente newUtente) {
        this.utenteRepository.save(newUtente);
        log.info("L'utente con {} è stato salvato correttamente", newUtente.getIdUtente());
    }

    public Utente findUtenteById(String idUtente) {
        Optional<Utente> foundOrNot = utenteRepository.findById(UUID.fromString(idUtente));
        if (foundOrNot.isPresent()) return foundOrNot.get();
        else throw new NotFoundException(idUtente);
    }
}
