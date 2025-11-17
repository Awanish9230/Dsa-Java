package Recursion;

public class Power {
    static int power(int num, int pow){
        if(pow==0){
            return 1;
        }
        int smallResult = power(num, pow - 1);
        int result = smallResult * num;
        return result;
        
    }

    // static void power(int num, int pow, int result){
    //     if(pow==0){
    //         System.out.println(result);
    //         return;
    //     }
    //     power(num,pow-1,result * num);
    // }
    public static void main(String[] args) {
        // power(2, 5, 1);
        int r= power(2, 6);
        System.out.println(r);
    }
}
