public class reverseInt {

    public static Integer reverseInt (int myNumber){

        int a =0;
        while (myNumber!=0){
            int remainder = myNumber % 10;
            a = (a * 10) +remainder;
            myNumber /= 10;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(reverseInt(123456));
    }
}
