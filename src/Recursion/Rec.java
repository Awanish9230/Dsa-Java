package Recursion;

public class Rec {
    static void show(int n){
        // base case
        if(n==0){
            return;
        }
        System.out.println("Awanish" + " " + n);
        show(n-1);
        System.out.println("verma" + " " + n);
        // n--;
        // show(n); NOT maintain state through this method
    }
    public static void main(String[] args) {
        show(5);
    }
}
