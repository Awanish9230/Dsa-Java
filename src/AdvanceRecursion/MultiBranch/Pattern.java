package AdvanceRecursion.MultiBranch;

//Multi Branch Example
public class Pattern {
    static void printStar(int numStars){
        if(numStars ==0){
            return;
        }
        System.out.print("*");
        printStar(numStars -1);
    }
    static void printLine(int rows){
        if(rows==0){
            return;
        }
        printLine(rows -1);
        printStar(rows);
        System.out.println();
    }
    public static void main(String[] args) {
        printLine(5);
    }
}
