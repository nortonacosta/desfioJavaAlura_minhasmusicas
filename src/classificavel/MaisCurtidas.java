package classificavel;


import models.Audio;

public class MaisCurtidas {
    public void classificar(Audio audio) {
    if(audio.getClassificacao() == 5) {
        System.out.println(audio.getTitulo() + " É a preferida do público");
    }else if(audio.getClassificacao() == 4) {
        System.out.println(audio.getTitulo() + " Uma das mais curtidas do publico");
    }else if(audio.getClassificacao() == 3) {
        System.out.println(audio.getTitulo() + " Esta entre as mais curtidas do publico");
    }else if(audio.getClassificacao() == 2) {
        System.out.println(audio.getTitulo() + " O publico gosta ");
    }else {
        System.out.println(audio.getTitulo() + " Estão gostando ");
      }
    }
}
