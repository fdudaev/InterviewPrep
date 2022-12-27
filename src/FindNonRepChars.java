public class FindNonRepChars {

public static Character firstNonRepChar(String str){

    for (char i : str.toCharArray()){
        if(str.indexOf(i) == str.lastIndexOf(i)){
            return i;
        }
    }
    return null;
}

    public static void main(String[] args) {
        System.out.println(firstNonRepChar("bloomberg"));
    }

}
