package Practice.Array;

public class MaxElement {
    static int maxEle(int arr[], int index){
        if(arr.length -1==index){
            return arr[index];
        }

        int maxi = maxEle(arr, index + 1);
        return Math.max(arr[index],maxi);
        
    }
    public static void main(String[] args) {
        int arr[] = {23,56,12,9,5};
        System.out.println(maxEle(arr, 0));

    }
}
