package Recursion;

public class SumOfDigit {
    static int sumOfDigit(int num){
        if(num ==0){
            return 0;
        }
        return sumOfDigit(num/10) + num % 10;
        // int sum = sumOfDigit(num/10);
        // return sum + num %10;

    }

    // static void sumOfDigit(int num, int sum){
    //     if(num==0){
    //         System.out.println(sum);
    //         return;
    //     }
    //     int lastDigit = num %10;
    //     num = num /10;
    //     sumOfDigit(num, sum= sum + lastDigit);
    //     // sumOfDigit(num/10, sum= sum + num % 10);
    // }




    public static void main(String[] args) {
        // sumOfDigit(543, 0);
        int res = sumOfDigit(5483);
        System.out.println(res);
    }
}
