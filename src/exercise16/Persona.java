package exercise16;

import java.util.Random;

public class Persona {
    private String name = "";
    private int age = 0;
    private String gender ;
    private double weight = 0;
    private double height = 0;
    private int DNI;
    public char letter ='H';

    public Persona() {
        generateDNI();
    }

    public Persona(String name, int age, char letter) {
        this.name = name;
        this.age = age;
        this.letter = letter;
        generateDNI();
    }

    public Persona(String name, int age, char letter, double weight, double height, int DNI) {
        this.name = name;
        this.age = age;
        this.letter = letter;
        this.weight = weight;
        this.DNI = DNI;
        this.height = height;
        generateDNI();
    }

    public String calculateIMC() {
        double formula = this.weight / (Math.pow(height, 2));
        String answerIMc = "Sin información suficiente";
        if (formula < 20) answerIMc = "Esta por debajo del peso ideal";
        else if (formula >= 20 && formula <= 25) answerIMc = "Esta en el peso ideal";
        else if (formula >20) answerIMc = "Esta por encima del peso ideal";
        return answerIMc;
    }

    public String isAdult() {
        boolean adult = (this.age > 18)? true:false;
        String answer = (adult == true)? "Mayor de edad":"Menor de edad";
        return answer;
    }

    public String getGender() {
        checkGender(this.letter);
        return gender;
    }

    public void checkGender(char letter){
        if (letter == 'H' || letter == 'M') {
            switch (letter){
                case 'H': {this.gender = "Masculino"; return;}
                case 'M': {this.gender = "Femenino"; return;}
            }
        }
    }

    public void generateDNI(){
        Random r = new Random();
        int n = r.nextInt(99999999-10000000)+10000000;
        this.DNI = n;
    }

    public String personaToString(){
        String information = "Nombre: "+this.name+"\n"+
                "Edad: "+this.age+" "+isAdult()+"\n"+
                "Genero: "+getGender()+"\n"+
                "Peso: "+this.weight+"\n"+
                "Altura: "+this.height+"\n"+
                "Estado: "+calculateIMC()+"\n"+
                "DNI: "+this.DNI+"\n\n";
        return information;
    }

}
