package exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = data.nextDouble();

        Circle circle1 = new Circle(radio);

        System.out.println("El area del circulo es: "+circle1.calculateArea());
    }
}
