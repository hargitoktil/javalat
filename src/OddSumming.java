public class OddSumming {
    public static void main(String[] args) {
        int total = 100;
        int i = 0;

        while (i<100) {
            total += i;
            i += 2;   
        }
        System.out.println("Kita udh dpt "+total+" totalnya "+i);
    }
}
