public class ReturnHighestORLowestNumberInArray {

    public static int findHighestNum (int [] array){

        int highest = array[0];
        for (int i : array){
            if (i > highest){
                highest = i;
            }
        }
        return highest;
    }
    public static int findLowestNum (int[] array){
        int lowest = array [0];
        for (int i : array){
            if (i < lowest){
                lowest = i;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        int a [] = {44, 11, 23, 41, 23, 22, 46};
        System.out.println("Highest number in this array is " + findHighestNum(a));
        System.out.println("Lowest number in this array is " + findLowestNum(a));
    }
}
