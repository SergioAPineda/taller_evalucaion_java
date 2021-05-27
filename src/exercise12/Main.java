package exercise12;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese dos palabras para comparar: ");
        String word1 = data.next();
        String word2 = data.next();

        Comparator comparator1 = new Comparator(word1, word2);
        comparator1.compareWords();
    }
}
