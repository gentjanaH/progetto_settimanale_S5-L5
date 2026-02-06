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


        } catch (NotFoundException ex) {
            log.info(ex.getMessage());
        }
    }
}
