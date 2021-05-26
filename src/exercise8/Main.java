package exercise8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: ");
        String typedDay = data.next();
        Day day1 = new Day(typedDay);
        day1.defineKindOfDay();

    }
}
