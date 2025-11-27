package AdvanceRecursion.MultiBranch;

public class TargetSumOfDice {
    static void targetSum(int start, int end ,String result){
        if(start == end ){
            System.out.print(result + " ");
            return;
        }
        if(start > end){
            return;
        }
        for(int dice=1; dice<11 ; dice++){
            targetSum(start + dice, end, result + dice);
        }
        // targetSum(start + 1, end, result + "1");
        // targetSum(start + 2, end, result + "2");
        // targetSum(start + 3, end, result + "3");
        // targetSum(start + 4, end, result + "4");
        // targetSum(start + 5, end, result + "5");
    }
    public static void main(String[] args) {
        targetSum(0, 10, " ");
        
    }
}
// time complexity 6^n