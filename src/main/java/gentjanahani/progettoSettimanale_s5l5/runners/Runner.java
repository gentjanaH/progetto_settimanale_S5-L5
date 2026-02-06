package gentjanahani.progettoSettimanale_s5l5.runners;

import gentjanahani.progettoSettimanale_s5l5.entities.*;
import gentjanahani.progettoSettimanale_s5l5.exceptions.NotFoundException;
import gentjanahani.progettoSettimanale_s5l5.services.EdificioService;
import gentjanahani.progettoSettimanale_s5l5.services.PostazioneAziendaleService;
import gentjanahani.progettoSettimanale_s5l5.services.UtenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Slf4j
public class Runner implements CommandLineRunner {


    private final EdificioService edificioService;
    private final UtenteService utenteService;
    private final PostazioneAziendaleService postazioneService;


    public Runner(EdificioService edificioService, UtenteService utenteService, PostazioneAziendaleService postazioneService) {
        this.edificioService = edificioService;
        this.utenteService = utenteService;
        this.postazioneService = postazioneService;
    }


    @Override
    public void run(String... args) throws Exception {
        //creo edifici
        Edificio ed1 = new Edificio("Business Tower", "Via del Commercio 12", "Milano");
        Edificio ed2 = new Edificio("Innovation Hub", "Viale Europa 45", "Roma");
        Edificio ed3 = new Edificio("Tech Campus", "Corso Galileo Ferraris 88", "Torino");
        Edificio ed4 = new Edificio("Meeting Center Aurelia", "Via Aurelia 210", "Roma");
        Edificio ed5 = new Edificio("Centro Direzionale Vesuvio", "Via Napoli 33", "Napoli");

        //creo utenti
        Utente utente1 = new Utente("mrossi", "Marco Rossi", "marco.rossi@example.com");
        Utente utente2 = new Utente("lbianchi", "Laura Bianchi", "laura.bianchi@example.com");
        Utente utente3 = new Utente("gverdi", "Giulia Verdi", "giulia.verdi@example.com");
        Utente utente4 = new Utente("fdamico", "Francesco D'Amico", "francesco.damico@example.com");
        Utente utente5 = new Utente("sconti", "Sara Conti", "sara.conti@example.com");


        //SAVE
//        edificioService.saveEdificio(ed1);
//        edificioService.saveEdificio(ed2);
//        edificioService.saveEdificio(ed3);
//        edificioService.saveEdificio(ed4);
//        edificioService.saveEdificio(ed5);

//        utenteService.saveUtente(utente1);
//        utenteService.saveUtente(utente2);
//        utenteService.saveUtente(utente3);
//        utenteService.saveUtente(utente4);
//        utenteService.saveUtente(utente5);


        try {
            //cerco edifici dal db da passare alle postazioni
            Edificio e1FromDb = edificioService.findEdificioById("278c5697-c0ce-4fbd-ae6e-3d0fbd6fe656");
            Edificio e2FromDb = edificioService.findEdificioById("64971bc7-82ef-43b6-9c5e-4b28469e16d5");
            Edificio e3FromDb = edificioService.findEdificioById("67da0a93-8308-451d-ba82-e9331e597e38");
            Edificio e4FromDb = edificioService.findEdificioById("b3275704-e8e7-44a2-9651-45e8acfd1146");
            Edificio e5FromDb = edificioService.findEdificioById("eb7a1be6-b5dd-412f-959b-f3faf3fb72dc");

            //creo postazioni

            PostazioneAziendale postazione1 = new PostazioneAziendale("Sala riunioni grande con proiettore", TipoPostazione.SALA_RIUNIONI, 20, e1FromDb);
            PostazioneAziendale postazione2 = new PostazioneAziendale("Open space luminoso", TipoPostazione.OPENSPACE, 50, e1FromDb);
            PostazioneAziendale postazione3 = new PostazioneAziendale("Ufficio privato", TipoPostazione.PRIVATO, 6, e1FromDb);
            PostazioneAziendale postazione4 = new PostazioneAziendale("Sala conferenze", TipoPostazione.SALA_RIUNIONI, 100, e2FromDb);
            PostazioneAziendale postazione5 = new PostazioneAziendale("Sala meeting media", TipoPostazione.SALA_RIUNIONI, 12, e2FromDb);
            PostazioneAziendale postazione6 = new PostazioneAziendale("Open space moderno", TipoPostazione.OPENSPACE, 80, e2FromDb);
            PostazioneAziendale postazione7 = new PostazioneAziendale("Sala brainstorming", TipoPostazione.SALA_RIUNIONI, 0, e3FromDb);
            PostazioneAziendale postazione8 = new PostazioneAziendale("Ufficio privato", TipoPostazione.PRIVATO, 3, e3FromDb);
            PostazioneAziendale postazione9 = new PostazioneAziendale("Open space", TipoPostazione.OPENSPACE, 40, e3FromDb);
            PostazioneAziendale postazione10 = new PostazioneAziendale("Sala meeting executive", TipoPostazione.SALA_RIUNIONI, 15, e4FromDb);
            PostazioneAziendale postazione11 = new PostazioneAziendale("Open space", TipoPostazione.OPENSPACE, 60, e4FromDb);
            PostazioneAziendale postazione12 = new PostazioneAziendale("Ufficio privato", TipoPostazione.PRIVATO, 8, e4FromDb);
            PostazioneAziendale postazione13 = new PostazioneAziendale("Sala riunioni – 8 posti", TipoPostazione.SALA_RIUNIONI, 25, e5FromDb);
            PostazioneAziendale postazione14 = new PostazioneAziendale("Open space", TipoPostazione.OPENSPACE, 0, e5FromDb);
            PostazioneAziendale postazione15 = new PostazioneAziendale("Ufficio privato", TipoPostazione.PRIVATO, 10, e5FromDb);

            //salvo le postazioni
//            postazioneService.savePostazione(postazione1);
//            postazioneService.savePostazione(postazione2);
//            postazioneService.savePostazione(postazione3);
//            postazioneService.savePostazione(postazione4);
//            postazioneService.savePostazione(postazione5);
//            postazioneService.savePostazione(postazione6);
//            postazioneService.savePostazione(postazione7);
//            postazioneService.savePostazione(postazione8);
//            postazioneService.savePostazione(postazione9);
//            postazioneService.savePostazione(postazione10);
//            postazioneService.savePostazione(postazione11);
//            postazioneService.savePostazione(postazione12);
//            postazioneService.savePostazione(postazione13);
//            postazioneService.savePostazione(postazione14);
//            postazioneService.savePostazione(postazione15);


        } catch (NotFoundException ex) {
            log.info(ex.getMessage());
        }

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


        } catch (NotFoundException ex) {
            log.info(ex.getMessage());
        }
    }
}
