package Practice;

public class EvenOddCountDigit {
    static int oddCount(int num){
        if(num ==0){
            return 0;
        }
        int count = !(num % 2 ==0)? 1 :0;
        return count + oddCount(num/10);
    }

    static int evenCount(int num){
        if(num ==0){
            return 0;
        }
        int count = (num % 2 ==0)? 1 :0;
        return count + evenCount(num/10);
    }
    
    public static void main(String[] args) {
        int e =evenCount(224488);
        int o =oddCount(11335577);
        System.out.println("Even Count " + e + " || " + " Odd Count " + o );
    }
}
