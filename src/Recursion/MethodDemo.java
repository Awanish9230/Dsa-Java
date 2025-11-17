package Recursion;

public class MethodDemo{
    void display(){
        System.out.println("Non static");
    }
    static void show(int x, int y){
        System.out.println("Static method");
    }
    public static void main(String[] args) {
        show(10,20);
        
    }
}