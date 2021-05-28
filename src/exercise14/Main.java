package exercise14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("***Contador de 2 en 2****\n\n" +
                "El numero que ingrese se contara de 2 en 2 hasta llegar a 1000. Por favor ingrese un numero: ");
        int typedNumber = data.nextInt();

        for (int i = typedNumber; i < 1001 ; i+=2) {
            typedNumber = i;
            System.out.println(i);
        }
        String options = "****** GESTION CINEMATOGRÁFICA ********\n\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6-VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR\n";

        data = new Scanner(System.in);
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
