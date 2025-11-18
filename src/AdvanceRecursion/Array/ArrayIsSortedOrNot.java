package AdvanceRecursion.Array;

public class ArrayIsSortedOrNot {
    static boolean isSorted(int arr[], int index){
        //base case
        if(index == arr.length -1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return isSorted(arr, index +1);
    }
    public static void main(String[] args) {
        // int arr[] = {20,10,80,60};
        int arr[] = {20,10,80,600};
        // boolean res = isSorted(arr, 0);
        System.out.println(isSorted(arr, 0)? "Sorted" : "Not Sorted ");
        
         
        // if(res == true){
        //     System.out.println("Sorted");
        // }else{
        //     System.out.println("Not Sorted");
        // }
    }
}
