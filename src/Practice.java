public class Practice {

    public static char getNonRepChar(String str){
        for (char i : str.toLowerCase().toCharArray()){
            if(str.indexOf(i) == str.lastIndexOf(i)){
                return i;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {

        String str = "bloomberg";
        System.out.println(getNonRepChar(str));



    }

}
