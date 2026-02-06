package gentjanahani.progettoSettimanale_s5l5.runners;

import gentjanahani.progettoSettimanale_s5l5.entities.Edificio;
import gentjanahani.progettoSettimanale_s5l5.entities.PostazioneAziendale;
import gentjanahani.progettoSettimanale_s5l5.entities.TipoPostazione;
import gentjanahani.progettoSettimanale_s5l5.entities.Utente;
import gentjanahani.progettoSettimanale_s5l5.exceptions.NotFoundException;
import gentjanahani.progettoSettimanale_s5l5.services.EdificioService;
import gentjanahani.progettoSettimanale_s5l5.services.PostazioneAziendaleService;
import gentjanahani.progettoSettimanale_s5l5.services.UtenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
            System.out.println(e1FromDb);
            System.out.println(e2FromDb);
            System.out.println(e3FromDb);
            System.out.println(e4FromDb);
            System.out.println(e5FromDb);

            //creo postazioni

            PostazioneAziendale postazione1 = new PostazioneAziendale(
                    "Sala riunioni grande con proiettore",
                    TipoPostazione.SALA_RIUNIONI,
                    20,
                    e1FromDb
            );

            PostazioneAziendale postazione2 = new PostazioneAziendale(
                    "Open space luminoso",
                    TipoPostazione.OPENSPACE,
                    50,
                    e1FromDb
            );

            PostazioneAziendale postazione3 = new PostazioneAziendale(
                    "Ufficio privato",
                    TipoPostazione.PRIVATO,
                    6,
                    e1FromDb
            );

            PostazioneAziendale postazione4 = new PostazioneAziendale(
                    "Sala conferenze",
                    TipoPostazione.SALA_RIUNIONI,
                    100,
                    e2FromDb
            );

            PostazioneAziendale postazione5 = new PostazioneAziendale(
                    "Sala meeting media",
                    TipoPostazione.SALA_RIUNIONI,
                    12,
                    e2FromDb
            );

            PostazioneAziendale postazione6 = new PostazioneAziendale(
                    "Open space moderno",
                    TipoPostazione.OPENSPACE,
                    80,
                    e2FromDb
            );

            PostazioneAziendale postazione7 = new PostazioneAziendale(
                    "Sala brainstorming",
                    TipoPostazione.SALA_RIUNIONI,
                    10,
                    e3FromDb
            );

            PostazioneAziendale postazione8 = new PostazioneAziendale(
                    "Ufficio privato",
                    TipoPostazione.PRIVATO,
                    3,
                    e3FromDb
            );

            PostazioneAziendale postazione9 = new PostazioneAziendale(
                    "Open space",
                    TipoPostazione.OPENSPACE,
                    40,
                    e3FromDb
            );


            PostazioneAziendale postazione10 = new PostazioneAziendale(
                    "Sala meeting executive",
                    TipoPostazione.SALA_RIUNIONI,
                    15,
                    e4FromDb
            );

            PostazioneAziendale postazione11 = new PostazioneAziendale(
                    "Open space",
                    TipoPostazione.OPENSPACE,
                    60,
                    e4FromDb
            );

            PostazioneAziendale postazione12 = new PostazioneAziendale(
                    "Ufficio privato",
                    TipoPostazione.PRIVATO,
                    8,
                    e4FromDb
            );


            PostazioneAziendale postazione13 = new PostazioneAziendale(
                    "Sala riunioni – 8 posti",
                    TipoPostazione.SALA_RIUNIONI,
                    25,
                    e5FromDb
            );

            PostazioneAziendale postazione14 = new PostazioneAziendale(
                    "Open space",
                    TipoPostazione.OPENSPACE,
                    30,
                    e5FromDb
            );

            PostazioneAziendale postazione15 = new PostazioneAziendale(
                    "Ufficio privato",
                    TipoPostazione.PRIVATO,
                    10,
                    e5FromDb
            );

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
    }
}
