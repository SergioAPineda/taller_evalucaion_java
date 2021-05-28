package exercise18;

public class Main {


    public static void main(String[] args) {
        Serie serie1 = new Serie("Game of Thrones", "Sergio");
        Serie serie2 = new Serie("Vikings", 12, "Terror", "Andres");
        Serie serie3 = new Serie("Gotham", "Maria");
        Serie serie4 = new Serie("Black Mirror", 2, "aventura", "Angelica");
        Serie serie5 = new Serie("Wanda", "Jose");
        Serie series[] = {serie1, serie2, serie3, serie4, serie5};

        VideoJuego videoJuego1 = new VideoJuego("Hallo", 20, "Aventura", "sony");
        VideoJuego videoJuego2 = new VideoJuego("Mario", 70, "Aventura", "nintendo");
        VideoJuego videoJuego3 = new VideoJuego("JustDance", 22, "baile", "Xbox");
        VideoJuego videoJuego4 = new VideoJuego("FIFA", 23, "deportes", "tensent");
        VideoJuego videoJuego5 = new VideoJuego("Crash", 12, "Aventura", "roli SA");
        VideoJuego videoJuegos[] = {videoJuego1, videoJuego2, videoJuego3, videoJuego4, videoJuego5};

        serie1.entregar();
        serie2.entregar();
        serie3.entregar();
        serie4.entregar();
        videoJuego1.entregar();
        videoJuego2.entregar();
        videoJuego3.entregar();
        videoJuego4.entregar();
        int contador = 0;

        for (Serie aux : series) {
            if (aux.isEntregado()) {
                contador++;
            }
        }
        System.out.println("hay " + contador + " series entregadas");
        contador = 0;
        for (VideoJuego aux : videoJuegos) {
            if (aux.isEntregado()) {
                contador++;
            }
        }
        System.out.println("hay " + contador + " videojuegos entregados");


        Serie mayor = series[0];
        for (int i = 0; i < series.length; i++) {
            if (series[i].compareTo(mayor)) {
                mayor = series[i];
            }

        }
        System.out.println("Serie con mayor temporadas:\n " + mayor.toString() + "\n");

        VideoJuego mayorVideojuego = videoJuegos[0];
        for (int i = 0; i < videoJuegos.length; i++) {
            if (videoJuegos[i].compareTo(mayorVideojuego)) {
                mayorVideojuego = videoJuegos[i];
            }
        }
        System.out.println("Videojuego con mayor horas: \n" + mayorVideojuego.toString() + "\n");

    }


}
