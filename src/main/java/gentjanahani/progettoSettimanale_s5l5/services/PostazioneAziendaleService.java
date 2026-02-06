package gentjanahani.progettoSettimanale_s5l5.services;

import gentjanahani.progettoSettimanale_s5l5.entities.PostazioneAziendale;
import gentjanahani.progettoSettimanale_s5l5.entities.TipoPostazione;
import gentjanahani.progettoSettimanale_s5l5.entities.Utente;
import gentjanahani.progettoSettimanale_s5l5.exceptions.NessunRisultatoException;
import gentjanahani.progettoSettimanale_s5l5.exceptions.NotFoundException;
import gentjanahani.progettoSettimanale_s5l5.repositories.PostazioneAziendaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    public List<PostazioneAziendale> filterByTypeAndCity(TipoPostazione tipoPostazione, String citta) {

        List<PostazioneAziendale> risultatiRicerca = postazioneAziendaleRepository.findLocationByTypeAndCity(tipoPostazione, citta);
        if (risultatiRicerca.isEmpty()) throw new NessunRisultatoException();

        log.info("Ci sono {}  risultati in base al tipo e alla città richiesti: ", risultatiRicerca.size());
        risultatiRicerca.forEach(System.out::println);
        return risultatiRicerca;
    }

}
