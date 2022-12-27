public class hasRemainder {

    /**
     * create a program that returns the result of blow descriptions
     * @param given Step 1.2.3.4) result = p1 + p2 * 100 find out if result % 40 has any remainder
     * 5. create a boolean var that assigns the value true, if the remainder is 0.00, or false if not zero
     * 6. output the boolean var just to see what the result is.
     * 7. write an if-then statement that displays a message, "got some remainder', if the boolean is step 5 is not true;
     */
    public static void main (String [] args){

        double p1 = 20.00d;
        double p2 = 80.00d;
        double p3 = (p1 + p2) * 100;
        double p4 = p3 % 40.00d;
        System.out.println(p4);
        boolean p5 = (p4 == 0)? true: false;
        System.out.println("the remainder = "+p5);

        if (p5 !=true){
            System.out.println("got some remainder");
        }else{
            System.out.println("got no remainder");
        }

    }


}

