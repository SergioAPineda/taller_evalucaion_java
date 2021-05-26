package exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese el costo del producto: ");
        double cost = data.nextDouble();

        Product product1 = new Product(cost);
        System.out.println("El costo del producto más el IVA es de: "+product1.calculateCost());
    }
}
