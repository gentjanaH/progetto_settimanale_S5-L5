package gentjanahani.progettoSettimanale_s5l5.runners;

import gentjanahani.progettoSettimanale_s5l5.services.EdificioService;
import gentjanahani.progettoSettimanale_s5l5.services.PostazioneAziendaleService;
import gentjanahani.progettoSettimanale_s5l5.services.UtenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner2 implements CommandLineRunner {


    private final EdificioService edificioService;
    private final UtenteService utenteService;
    private final PostazioneAziendaleService postazioneService;


    public Runner2(EdificioService edificioService, UtenteService utenteService, PostazioneAziendaleService postazioneService) {
        this.edificioService = edificioService;
        this.utenteService = utenteService;
        this.postazioneService = postazioneService;
    }

    @Override
    public void run(String... args) throws Exception {
        //ora devo creare delle prenotazioni

    }
}
