package exercice2;

public class NumberComparator {
    private int number1;
    private int number2;
    private int greaterNumber;
    private int smallerNumber;

    public NumberComparator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void compareNumbers() {
        if (number1 == number2) {
            System.out.println("Los números son iguales");
        } else {
            this.greaterNumber = Math.max(number1, number2);
            System.out.println("el número mayor es: " + this.greaterNumber);
            this.smallerNumber = Math.min(number1, number2);
            System.out.println("el número mayor es: " + this.smallerNumber);
        }
    }

};

