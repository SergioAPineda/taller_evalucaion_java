package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int number1 = data.nextInt();
        System.out.println("Ingrese el primer número: ");
        int number2 = data.nextInt();

        NumberComparator comparator1 = new NumberComparator(number1, number2);
        comparator1.compareNumbers();
    }
}
