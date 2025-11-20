package AdvanceRecursion.String;

public class SearchAndReplace {
    static String searchAndReplace(String str, char search,char replace){
        if(str.length() == 0){
            return " ";
        }
        String lastRes = searchAndReplace(str.substring(1), search, replace);
        if(str.charAt(0) == search){
            // return replace + lastRes;
            return lastRes;
        }else{
            return str.charAt(0) + lastRes;
        }
        // char newRes = (str.charAt(0) == search) ? 'x' :str.charAt(0);
        // char newRes = (str.charAt(0) == search) ? ' ' :str.charAt(0);
        // return newRes + lastRes;
    }
    public static void main(String[] args) {
        String res = searchAndReplace("Hello", 'l', 'x');
        System.out.println(res);
    }
}
