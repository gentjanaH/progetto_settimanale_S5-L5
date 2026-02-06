package gentjanahani.progettoSettimanale_s5l5.runners;

import gentjanahani.progettoSettimanale_s5l5.entities.PostazioneAziendale;
import gentjanahani.progettoSettimanale_s5l5.entities.Utente;
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
            PostazioneAziendale pos1FromDb = postazioneService.findPstazioneById("022f07d8-b274-4039-8047-94690d35dd1f");
            PostazioneAziendale pos2FromDb = postazioneService.findPstazioneById("0340e1b5-843d-42bb-9a12-100c69750cbc");
            PostazioneAziendale pos3FromDb = postazioneService.findPstazioneById("0cda5068-8e9e-4d1a-9b8b-e8cbf0f83f58");
            PostazioneAziendale pos4FromDb = postazioneService.findPstazioneById("0f68b7eb-a54d-4c11-87d3-2b518f157fd6");
            PostazioneAziendale pos5FromDb = postazioneService.findPstazioneById("19b57593-ec36-4dd8-8914-5fac1de0f89b");
            PostazioneAziendale pos6FromDb = postazioneService.findPstazioneById("59e507ef-800d-4b06-a9e3-f23de7d437b2");
            PostazioneAziendale pos7FromDb = postazioneService.findPstazioneById("6b4c76f3-1792-42b3-976f-326390ba9294");
            PostazioneAziendale pos8FromDb = postazioneService.findPstazioneById("727b1546-b8d4-4354-9ff5-cbdec91e9952");
            PostazioneAziendale pos9FromDb = postazioneService.findPstazioneById("7ddb326a-745a-4048-90bc-82373b37504b");
            PostazioneAziendale pos10FromDb = postazioneService.findPstazioneById("8e881993-df35-4df8-8ac6-1a7847e94849");
            PostazioneAziendale pos11FromDb = postazioneService.findPstazioneById("a3e940bc-1554-4cef-881b-add0c69c9a5a");
            PostazioneAziendale pos12FromDb = postazioneService.findPstazioneById("ba9531c4-96fc-4fb3-a3fc-b1bf0a9cd644");
            PostazioneAziendale pos13FromDb = postazioneService.findPstazioneById("cc50fca1-2cd7-4af7-bdad-ee94719f34ac");
            PostazioneAziendale pos14FromDb = postazioneService.findPstazioneById("d65e777c-f456-46a3-ad79-f4234c7d5e40");
            PostazioneAziendale pos15FromDb = postazioneService.findPstazioneById("f4417a53-1556-4dbe-9837-9ca3fe8343b1");

            //ora devo creare delle prenotazioni
            prenotazioniService.createAndSavePrenotazione(LocalDate.of(2026, 2, 22), pos1FromDb, u1FromDb);
        } catch (NotFoundException ex) {
            log.info(ex.getMessage());
        } catch (PostazioneOccupataException ex2) {
            log.info(ex2.getMessage());
            //ho provato a salvare la stessa prenotazione e l'errore viene gestito correttamente
        }

    }
}
