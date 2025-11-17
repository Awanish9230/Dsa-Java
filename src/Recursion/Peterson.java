package Recursion;

public class Peterson {
    // static int peterson(int num, int org){

    // }

    // static void peterson(int num, int sum, int org){
    //     if(num ==0){
    //         System.out.println(sum);
    //         return;
    //     }

    //     int  factNum = num %10;
    //     int factRes =1;
    //     while (factNum > 0){  
    //         factRes = factRes  * factNum ;
    //         factNum --;

    //     }
    //     peterson(num/10, sum + factRes, org);
    // }

    static int fact(int num){
        if(num ==0 || num ==1){
            return num;
        }
        return fact(num -1) * num;
    }

    
    static void peterson(int num, int sum, int org){
        if(num==0){
            System.out.println(org == sum ? "Peterson" : "Not Peterson");
            return;
        }
        peterson(num/10, sum + fact(num%10) , org);
    }
    public static void main(String[] args) {
        // int org =145;
        // int r=peterson(org, org) ;
        // System.out.println(org==r? "Peterson num" : "Not Peterson Number");
        peterson(1455, 0, 145);
    }
}
