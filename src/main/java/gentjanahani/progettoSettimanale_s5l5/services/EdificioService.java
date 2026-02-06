package gentjanahani.progettoSettimanale_s5l5.services;

import gentjanahani.progettoSettimanale_s5l5.entities.Edificio;
import gentjanahani.progettoSettimanale_s5l5.exceptions.NotFoundException;
import gentjanahani.progettoSettimanale_s5l5.repositories.EdificoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class EdificioService {

    private final EdificoRepository edificoRepository;

    @Autowired
    public EdificioService(EdificoRepository edificoRepository) {
        this.edificoRepository = edificoRepository;
    }

    public void saveEdificio(Edificio newEdificio) {
        this.edificoRepository.save(newEdificio);
        log.info("L'edificio con {} è stato salvato correttamente", newEdificio.getIdEdificio());
    }

    public Edificio findEdificioById(String idEdificio) {
        Optional<Edificio> foundOrNot = edificoRepository.findById(UUID.fromString(idEdificio));
        if (foundOrNot.isPresent()) return foundOrNot.get();
        else throw new NotFoundException(idEdificio);
    }


}
