package exercise7;

public class Main {
    public static void main(String[] args) {
        Number number1 = new Number();

        do {
            number1.getNumber();
        } while(number1.number <= 0);
    }
}
