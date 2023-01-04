import java.util.Arrays;

public class BinarySearch {
    /**
     * Search for a number
     * @param array - Array to search
     * @param numberToSearchFor Number that we are looking for
     * @return true if found, false is not found
     */
    public static boolean searchForDup(int array[], int numberToSearchFor) {

        // Array must be sorted first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);

        if (index >= 0){ // if condition is 0 return true;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] array = {4, 2, 1, 5, 2, 3};
        int numberToSearchFor = 3;

        System.out.println(searchForDup(array, numberToSearchFor));
    }

}
