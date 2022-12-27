import java.util.Arrays;

public class ReverseOrderOfTheWords {
    public static void reverseOrder(String word){

    }

    public static void main(String[] args) {

        String word = "I will have interview soon";

        reverseOrder(word);

        String [] a = word.split(" ");
        Arrays.sort(a);
        System.out.println(a[4] + "" +a[3] + " " +a[2] + " " +a[1] + " " +a[0]);

        System.out.println(Arrays.toString(a));


    }
}
