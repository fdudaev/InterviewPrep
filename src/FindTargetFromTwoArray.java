import java.util.Arrays;

public class FindTargetFromTwoArray {

    public static boolean findTarget (int array1[], int [] array2, int target){

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] + array2[j] == target){
                    //return new int[]{i, j};
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String [] args){

        String tp = "Must be reversed";
        for (int i = tp.length(); i <= 0; i--){
            System.out.println(tp.charAt(i));
        }




        int [] a1 = {1, 2, 3};
        int [] a2 = {8, 6 ,12};
        int t = 8;
        //System.out.println(Arrays.toString(findTarget(a1, a2, t)));
        System.out.println(findTarget(a1, a2, t));

    }

}
