package exercise5;

public class Number {

    public void getEvensAndOdd(){
        int count = 0;
        while(count < 100){
            count ++;
            if(count%2 == 0){
                System.out.println(count+" es un número par");
            }else {
                System.out.println(count+" es un número impar");
            }
        }
    }
    public static void main(String[] args) {
        Number listOfNumbers = new Number();
        listOfNumbers.getEvensAndOdd();
    }
}
