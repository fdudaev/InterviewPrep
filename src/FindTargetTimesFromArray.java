public class FindTargetTimesFromArray {

    public static int [] findTargetMultipleTimes(int [] A, int target){

        for (int i = 0; i < A.length -1; i++){
            for (int j = i + 1; j < A.length; j++){
                if (A[i] + A[j] == target){
                    System.out.print("["+i + "][" + j+"] ");
                }
            }
        }
        return null;
    }
    public static void main (String [] args){

        int [] A = {4, 5, 3, 4, 3};
        int target = 8;

        findTargetMultipleTimes(A, target);

    }


}
