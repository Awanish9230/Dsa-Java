package Recursion;

public class CountEvenOdd {
    static void countEvenOdd(int range,int evenCount, int oddCount){
        if(range ==0){
            System.out.println("Even Count " + evenCount + " odd Count " + oddCount);
            return;
        }

        if(range % 2 ==0){
            evenCount ++;
        }else{
            oddCount++;
        }
        countEvenOdd(range-1, evenCount ,oddCount);
    }
    public static void main(String[] args) {
        countEvenOdd(100, 0, 0);
    }
}
