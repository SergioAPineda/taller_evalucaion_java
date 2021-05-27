package exercise15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String options = "****** GESTION CINEMATOGRÁFICA ********\n\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6-VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR\n";

        Scanner data = new Scanner(System.in);
        System.out.println(options);
        Menu menu1;

        do {

            System.out.println("Escriba el número de la opción que requiere");
            int number = data.nextInt();
            menu1 = new Menu(options, number);
            menu1.answerSelection();

        } while (menu1.isShowingMenu());


    }
}
