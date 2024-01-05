import models.*;
import classificavel.*;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.setTitulo("Me atraiu");
        musica1.setArtista("Gabriela Rocha");

        for (int i = 0; i < 20000; i++) {
            musica1.curtir();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Teologia");
        podcast1.setDescricao("Um podcast sobre teologia");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduzir();
        }


        MaisCurtidas preferidas = new MaisCurtidas();
        preferidas.classificar(musica1);
        preferidas.classificar(podcast1);


    }//fecha psvm
}//fecha main