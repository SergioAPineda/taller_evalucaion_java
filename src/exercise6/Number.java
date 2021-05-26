package exercise6;

public class Number {
    public void getEvensAndOdd() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es un número par");
            } else {
                System.out.println(i + " es un número impar");
            }
        }
    }

    public static void main(String[] args) {
        exercise5.Number listOfNumbers = new exercise5.Number();
        listOfNumbers.getEvensAndOdd();
    }
}
