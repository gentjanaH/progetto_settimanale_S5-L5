package gentjanahani.progettoSettimanale_s5l5.services;

import gentjanahani.progettoSettimanale_s5l5.entities.PostazioneAziendale;
import gentjanahani.progettoSettimanale_s5l5.entities.Utente;
import gentjanahani.progettoSettimanale_s5l5.exceptions.NotFoundException;
import gentjanahani.progettoSettimanale_s5l5.repositories.PostazioneAziendaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class PostazioneAziendaleService {

    private final PostazioneAziendaleRepository postazioneAziendaleRepository;

    @Autowired
    public PostazioneAziendaleService(PostazioneAziendaleRepository postazioneAziendaleRepository) {
        this.postazioneAziendaleRepository = postazioneAziendaleRepository;
    }

    public void savePostazione(PostazioneAziendale newPostazione) {
        this.postazioneAziendaleRepository.save(newPostazione);
        log.info("La postazione con {} è stata salvata correttamente", newPostazione.getIdPostazione() + " in " + newPostazione.getEdificio().getNome());
    }

    public PostazioneAziendale findPstazioneById(String idPostazione) {
        Optional<PostazioneAziendale> foundOrNot = postazioneAziendaleRepository.findById(UUID.fromString(idPostazione));
        if (foundOrNot.isPresent()) return foundOrNot.get();
        else throw new NotFoundException(idPostazione);
    }
}
