package gentjanahani.progettoSettimanale_s5l5.repositories;

import gentjanahani.progettoSettimanale_s5l5.entities.PostazioneAziendale;
import gentjanahani.progettoSettimanale_s5l5.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostazioneAziendaleRepository extends JpaRepository<PostazioneAziendale, UUID> {

    //query che cerca postazione in base al tipo e alla città
    @Query("SELECT p FROM PostazioneAziendale p WHERE p.tipoPostazione =:tipoPostazione AND p.edificio.citta =:citta")
    List<PostazioneAziendale> findLocationByTypeAndCity(TipoPostazione tipoPostazione, String citta);
}
