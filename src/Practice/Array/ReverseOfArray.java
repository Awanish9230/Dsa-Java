package Practice.Array;

public class ReverseOfArray {
    static int[] rev(int arr[], int index){
         if (index == arr.length) {
            return new int[arr.length];
        }

        int revArr[] = rev(arr, index + 1);

        // Filling reversed array while coming back
        revArr[arr.length - 1 - index] = arr[index];

        return revArr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int result[] = rev(arr, 0);
        for(int r: result){
            System.out.println(r);
        }
        
    }
}
