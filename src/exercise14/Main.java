package exercise14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("***Contador de 2 en 2****\n\n" +
                "El numero que ingrese se contara de 2 en 2 hasta llegar a 1000. Por favor ingrese un numero: ");
        int typedNumber = data.nextInt();
        int newNumber;

        for (int i = typedNumber; i < 1001 ; i+=2) {
            typedNumber = i;
            System.out.println(i);
        }

    }
}
