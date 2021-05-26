package exercise7;

import java.util.Scanner;

public class Number {
    public int number;

    public void getNumber() {
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        this.number = data.nextInt();
    }
}
