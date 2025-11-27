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

        System.out.println("Post call {num -3}  " + num);
        tree(num-3);

        System.out.println("Post call {num -4}  " + num);
        tree(num-4);

        System.out.println("Post call {num -5}  "  + num);
        tree(num-5);
    }
    public static void main(String[] args) {
        tree(5);
    }
}
// try with 5 call by own 