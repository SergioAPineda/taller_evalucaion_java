package exercise16;

public class Main {
    public static void main(String[] args) {
        Persona sergio = new Persona();
        Persona andres = new Persona("Andres",27,'H');
        Persona angelica = new Persona("Angelica",28,'M',67.8,1.55,1022389858);

        System.out.println(angelica.personaToString());
        System.out.println(andres.personaToString());
        System.out.println(sergio.personaToString());
    }
}
