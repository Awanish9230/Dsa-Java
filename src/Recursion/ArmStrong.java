package Recursion;

public class ArmStrong {
    static int power(int num, int pow){
        if(pow==0){
            return 1;
        }
        return power(num, pow -1) * num;
    }

    static int countDigit(int num){
        if(num ==0){
            return 0;
        }
        return 1 + countDigit(num/10);

    }

    static boolean isArmStrong(int num,int org, int sum, int totalDigit){
        if(num ==0){
            return sum == org;
        }
        int lastDigit = num %10;
        sum = sum + power(lastDigit, totalDigit);
        return isArmStrong(num/10, org, sum, totalDigit);
    }


    static int countArmStrong(int range){
        if(range ==0){
            return 0;
        }
        boolean result = isArmStrong(range,range,0,countDigit(range));
        int c = countArmStrong(range-1);
        if(result){
            c++;
        }
        return c;
    }
    
    public static void main(String[] args) {
        
        System.out.println(countArmStrong(10000));
    } 
}
