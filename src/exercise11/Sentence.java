package exercise11;

public class Sentence {
    String newSentence;
    int countA = 0;
    int countE = 0;
    int countI = 0;
    int countO = 0;
    int countU = 0;

    public Sentence(String newSentence) {
        this.newSentence = newSentence;
    }

    public void countVowels(){
        String lowerSentence = this.newSentence.toLowerCase();
        for (int i = 0; i < lowerSentence.length(); i++) {
            switch (lowerSentence.charAt(i)){
                case 'a':{
                    countA ++;
                    break;
                }
                case 'e':{
                    countE ++;
                    break;
                }
                case 'i':{
                    countI ++;
                    break;
                }
                case 'o':{
                    countO ++;
                    break;
                }
                case 'u':{
                    countU ++;
                    break;
                }
            }
        }
    }
}
