public class Oddity {
    public static void main(String[] args) {
        int [] intArray = {32, 67, 86, 90, 26, 34, 92, 13, 70, 50};

         for (int number : intArray) {
      // Call your custom method
      if (isOdd(number)) System.out.print(number + ",");
    }
  

    }
    static boolean isOdd (int evens) {
        return (evens % 2) != 0;
    }
}
