package Practice;

public class CountNoOfZero {
    static int countNoOfZero(int num){
        if(num ==0){
            return 1;
        }
        int count = (num % 10 == 0) ? 1 : 0;
        if(num < 10){
            return count;
        }
        return count + countNoOfZero(num/10);

    }
    public static void main(String[] args) {
        int  count = countNoOfZero(0000);
        System.out.println(count);
    }
}
