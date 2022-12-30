public class reverseCharArray {

    public static void reverseCharArray (char [] myChar){

        for (int i = myChar.length - 1; i >= 0; i--){
            System.out.print(myChar[i]+"|");
        }
    }

    public static void main(String[] args) {
        char [] a = {'A','B','C','D'};
        reverseCharArray(a);
    }
}
