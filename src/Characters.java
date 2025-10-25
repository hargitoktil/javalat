public class Characters {
    public static void main(String[] args) {
        String[] conjugation = {"hide", "hindered", "hiding", "hidden", "hindering", "hid", "hides", "hinder"};
        int lengthConjug = conjugation.length;
        int numberOfCharackter = 0;

        for(int i = 0; i<lengthConjug;i++){
            String word = conjugation[i];
            numberOfCharackter += word.length();
        }
    System.out.println("total di array ada "+ numberOfCharackter + " karakter");
    }
}
