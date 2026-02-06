package gentjanahani.progettoSettimanale_s5l5.runners;

import gentjanahani.progettoSettimanale_s5l5.entities.Edificio;
import gentjanahani.progettoSettimanale_s5l5.entities.Utente;
import gentjanahani.progettoSettimanale_s5l5.services.EdificioService;
import gentjanahani.progettoSettimanale_s5l5.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {


    private final EdificioService edificioService;
    private final UtenteService utenteService;


    public Runner(EdificioService edificioService, UtenteService utenteService) {
        this.edificioService = edificioService;
        this.utenteService = utenteService;
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

        utenteService.saveUtente(utente1);
        utenteService.saveUtente(utente2);
        utenteService.saveUtente(utente3);
        utenteService.saveUtente(utente4);
        utenteService.saveUtente(utente5);
    }
}
