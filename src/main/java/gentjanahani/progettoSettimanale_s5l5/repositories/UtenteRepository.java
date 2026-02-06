package gentjanahani.progettoSettimanale_s5l5.repositories;

import gentjanahani.progettoSettimanale_s5l5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, UUID> {

    boolean existsByEmail(String email);
}
