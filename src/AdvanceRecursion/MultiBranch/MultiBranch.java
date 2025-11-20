package AdvanceRecursion.MultiBranch;

public class MultiBranch {
    static void tree(int num){
        if(num <=0){
            return;
        }
        System.out.println("Pre call " + num);
        tree(num-1);

        System.out.println("Between call " + num);
        tree(num-2);

        System.out.println("Post call " + num);
    }
    public static void main(String[] args) {
        tree(5);
    }
}
// try with 5 call by own 