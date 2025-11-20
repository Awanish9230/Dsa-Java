package AdvanceRecursion.String;

public class ReverseStr {
    static String twoPointer(char arr[],int left, int right){
        if(left > right){
            return new String (arr);
        }
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return twoPointer(arr, left+1, right-1);

    }

    static String reverseApproch2(String str){
        return twoPointer(str.toCharArray(), 0, str.length()-1);

    }
    
    // static String reverse(String str){
    //     if(str.length() == 0){
    //         return " ";
    //     }
    //     //make str small
    //     String old =reverse(str.substring(1));
    //     char newResult = str.charAt(0);
    //     return old + newResult;
    // }
    public static void main(String[] args) {
        // String rev = reverse("awanish");
        String rev = reverseApproch2("awan");
        System.out.println(rev);
    }
}
