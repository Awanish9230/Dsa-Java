package Practice.Array;

public class SumOfArray {
    static int sum(int arr[],int index){
        if(arr.length == index){
            return 0;
        }

        int res = sum(arr, index + 1);
        res = res + arr[index];
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sum(arr, 0));
    }
}
