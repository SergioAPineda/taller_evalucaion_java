package exercise9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String sentence = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Ingrese una frase");
        String sentence2 = data.nextLine();
        System.out.println(sentence.replace("a", "e") + " " + sentence2);
    }
}
