package exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String sentence = data.nextLine();
        System.out.println(sentence.replace(" ", ""));
    }
}