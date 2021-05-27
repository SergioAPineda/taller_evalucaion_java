package exercise11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String sentence = data.nextLine();

        Sentence sentence1 = new Sentence(sentence);
        sentence1.countVowels();

        System.out.println("La longitud de la cadena es: "+sentence.length()+"" +
                "\nLa letra a aperece: "+sentence1.countA+" veces"+
                "\nLa letra e aperece: "+sentence1.countE+" veces"+
                "\nLa letra i aperece: "+sentence1.countI+" veces"+
                "\nLa letra o aperece: "+sentence1.countO+" veces"+
                "\nLa letra u aperece: "+sentence1.countU+" veces"
        );
    }
}
