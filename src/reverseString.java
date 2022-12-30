import java.util.Arrays;

public class reverseString {
    /**
     * crete few methods to reverse a String
     */

    public static String reverseWithForLoop(String str){

        String a = "";
        for (int i = str.length() - 1; i >= 0; i--){
            a = a + str.charAt(i);
        }
        return a;
    }
    public static void withStringBuilder (String str){
        System.out.println(new StringBuilder(str.toLowerCase()).reverse());
    }
    public static String reverseStr (String str){
        String a = "";
        for (int i = 0; i < str.length(); i++ ){
            a = str.charAt(i) + a;
        }
        return a;
    }

    public static void main(String[] args) {
        String str = ("bloomberg");
        System.out.println(reverseWithForLoop(str));
        withStringBuilder(str);
        System.out.println(reverseStr(str));

    }
}
