public class Recap {
public static void main(String[] args) {
    String word= "Hey";

    for (int i= 0; i<word.length();i++){
        System.out.println(word.charAt(i));
        if (i == 2){
            System.out.println(("!"));
            break;
        }
        System.out.println("-");
    }
}
}
