import java.util.*;
public class Naveen {
    public static void main(String []args){
        int[] a={1,2,3,4,5};
//        printing the odd numbers
        Arrays.stream(a).filter(e -> e % 2 != 0).forEach(System.out::println);

        // Collecting odd numbers into another array and printing them
        int[] b = Arrays.stream(a).filter(e -> e % 2 != 0).toArray();
        Arrays.stream(b).forEach(System.out::println);
    }
}
