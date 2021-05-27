package exercise12;

public class Comparator {
    private String word1;
    private String word2;
    private Boolean equalLength = false;
    public Comparator(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public void compareWords(){
        String lowerWord1 = word1.toLowerCase();
        String lowerWord2 = word2.toLowerCase();
        if(lowerWord1.equals(lowerWord2)){
            System.out.println("Las palabras son iguales");
        } else {
            showDifferences();
        }
    }

    public void compareLength() {
        if(this.word1.length() == this.word2.length()){
            this.equalLength = true;
            System.out.println("Las palabras tienen la misma longitud, pero diferentes caracteres");
        } else{
            System.out.println("Las palabras tienen diferente longitud");
        }
    }

    public void showDifferences() {
        compareLength();
        String lowerWord1 = word1.toLowerCase();
        String lowerWord2 = word2.toLowerCase();
        if(this.equalLength){
            for (int i = 0; i < lowerWord1.length(); i++) {
               if(lowerWord1.charAt(i) != lowerWord2.charAt(i)){
                   System.out.println("La letra "+lowerWord1.charAt(i) +" en la posicion "+(i+1)+" de la plabra 1 no es la misma en la pabra 2" );
               }
            }
        }
    }
}
