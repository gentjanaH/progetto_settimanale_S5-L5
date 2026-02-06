package gentjanahani.progettoSettimanale_s5l5.runners;

import gentjanahani.progettoSettimanale_s5l5.entities.PostazioneAziendale;
import gentjanahani.progettoSettimanale_s5l5.entities.TipoPostazione;
import gentjanahani.progettoSettimanale_s5l5.entities.Utente;
import gentjanahani.progettoSettimanale_s5l5.exceptions.NessunRisultatoException;
import gentjanahani.progettoSettimanale_s5l5.exceptions.NotFoundException;
import gentjanahani.progettoSettimanale_s5l5.exceptions.PostazioneOccupataException;
import gentjanahani.progettoSettimanale_s5l5.services.EdificioService;
import gentjanahani.progettoSettimanale_s5l5.services.PostazioneAziendaleService;
import gentjanahani.progettoSettimanale_s5l5.services.PrenotazioniService;
import gentjanahani.progettoSettimanale_s5l5.services.UtenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

import static gentjanahani.progettoSettimanale_s5l5.entities.TipoPostazione.OPENSPACE;
import static gentjanahani.progettoSettimanale_s5l5.entities.TipoPostazione.SALA_RIUNIONI;

@Component
@Slf4j
public class Runner2 implements CommandLineRunner {


    private final EdificioService edificioService;
    private final UtenteService utenteService;
    private final PostazioneAziendaleService postazioneService;
    private final PrenotazioniService prenotazioniService;


    public Runner2(EdificioService edificioService, UtenteService utenteService, PostazioneAziendaleService postazioneService, PrenotazioniService prenotazioniService) {
        this.edificioService = edificioService;
        this.utenteService = utenteService;
        this.postazioneService = postazioneService;
        this.prenotazioniService = prenotazioniService;
    }

    @Override
    public void run(String... args) throws Exception {

        try {
            //cercare utenti dal db
            Utente u1FromDb = utenteService.findUtenteById("444244f4-251a-431c-9085-f7c937999434");
            Utente u2FromDb = utenteService.findUtenteById("449cbb27-fce5-41d3-89e3-194938e242c0");
            Utente u3FromDb = utenteService.findUtenteById("a50a2da8-0ce6-43f3-8635-1b1b4324e0ef");
            Utente u4FromDb = utenteService.findUtenteById("c28e615b-bfab-4520-ac12-50f72e01180c");
            Utente u5FromDb = utenteService.findUtenteById("dfe51aa5-3be9-4ebc-9555-6f578a3550bc");

            //cercare postazioni dal db
            PostazioneAziendale pos1FromDb = postazioneService.findPstazioneById("0865fa55-bc5f-46f7-89a8-5c8444de74ea");
            PostazioneAziendale pos2FromDb = postazioneService.findPstazioneById("2fc302da-0b8f-4249-92cc-a70af0089bd0");
            PostazioneAziendale pos3FromDb = postazioneService.findPstazioneById("3dab57a1-2484-47c5-bda4-9e60ab156285");
            PostazioneAziendale pos4FromDb = postazioneService.findPstazioneById("40f46953-7496-4892-9529-9c6cf9823719");
            PostazioneAziendale pos5FromDb = postazioneService.findPstazioneById("7210ab72-c9b9-4ee5-bc24-c21148cd514a");
            PostazioneAziendale pos6FromDb = postazioneService.findPstazioneById("72f1a5bf-5c04-4783-acbd-bb1bcc07cba5");
            PostazioneAziendale pos7FromDb = postazioneService.findPstazioneById("75ac0984-e0e0-4ecb-8654-1d5955458642");
            PostazioneAziendale pos8FromDb = postazioneService.findPstazioneById("7a88d469-f80d-4ae6-8ae1-5fd11260bf27");
            PostazioneAziendale pos9FromDb = postazioneService.findPstazioneById("7d5f11ad-9c86-4c2a-9e00-565dce249445");
            PostazioneAziendale pos10FromDb = postazioneService.findPstazioneById("a792792f-1937-44b0-9b1b-b6a9ce6eb1ce");
            PostazioneAziendale pos11FromDb = postazioneService.findPstazioneById("aa2feb28-173a-4b04-a43c-9ba260796d81");
            PostazioneAziendale pos12FromDb = postazioneService.findPstazioneById("c0614212-8e5b-4532-8354-7336948deb79");
            PostazioneAziendale pos13FromDb = postazioneService.findPstazioneById("c82c9d0d-cfae-4246-b7d1-86e19a7abfa1");
            PostazioneAziendale pos14FromDb = postazioneService.findPstazioneById("db202253-10c3-40e3-a70d-6a44b21a99ed");
            PostazioneAziendale pos15FromDb = postazioneService.findPstazioneById("fc057053-e055-48f3-b441-be7f8d0badbc");

            //ora devo creare delle prenotazioni
            //controllare che lo stesso utente non possa prenotare due sale lo stesso giorno.
            prenotazioniService.createAndSavePrenotazione(LocalDate.of(2026, 5, 10), pos4FromDb, u4FromDb);
//            postazioneService.filterByTypeAndCity(TipoPostazione.OPENSPACE, "Milano");
        } catch (NotFoundException ex) {
            log.info(ex.getMessage());
        } catch (PostazioneOccupataException ex2) {
            log.info(ex2.getMessage());
            //ho provato a salvare la stessa prenotazione e l'errore viene gestito correttamente
        } catch (NessunRisultatoException ex3) {
            log.info(ex3.getMessage());

        }

    }
}
