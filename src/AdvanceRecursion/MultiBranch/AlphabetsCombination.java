package AdvanceRecursion.MultiBranch;

public class AlphabetsCombination {
    static void combinationGenerator(int range, String res){
        if(range == 0){
            System.out.print(res + ",");
            return;
        }
        for(char ch ='A'; ch<='Z'; ch++){
            if(ch =='A' || ch=='E' || ch=='I' || ch == 'O' || ch == 'U')
            combinationGenerator(range-1, res + ch);
        }

        // combinationGenerator(range-1, res + 'A');
        // combinationGenerator(range-1, res + 'B');
        // combinationGenerator(range-1, res + 'C');
        // combinationGenerator(range-1, res + 'D'); upto z

    }
    public static void main(String[] args) {
        int range = 4;
        combinationGenerator(range, " ");

    }
}
