public class Main {

    public static void main(String[] args) {

        char[] a = {'C', 'W', 'F', 'A', 'Q'};

        //printReverse(a);
        reverseString("farrukh");

    }

    public static void printReverse(char[] letters) {
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i]);
        }
    }

    public static void reverseString(String str) {

        String a = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            a = a + str.charAt(i);
            System.out.println(a);
        }



    }


    public static void myTest() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


        String name = "farrukh";
        String revName = "";
        for (
                int i = 0; i < name.length(); i++) {
            revName = name.charAt(i) + revName;
        }
        System.out.println(revName);
        System.out.println(name);

        System.out.println(new

                StringBuilder(name).

                reverse());

        int num = 12344556;
        int revNum = 0;
        while (num != 0) {
            int remNum = num % 10;
            revNum = (revNum * 10) + remNum;
            num /= 10;
        }
        System.out.println(revNum);

    }
}