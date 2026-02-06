package gentjanahani.progettoSettimanale_s5l5.repositories;

import gentjanahani.progettoSettimanale_s5l5.entities.PostazioneAziendale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostazioneAziendaleRepository extends JpaRepository<PostazioneAziendale, UUID> {


}
