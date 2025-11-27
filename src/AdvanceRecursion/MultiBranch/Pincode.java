package AdvanceRecursion.MultiBranch;

public class Pincode {
    static void pincodeGenerator(int range, String result){
        if(range == 0){
            // System.out.println(result);
            System.out.print(result + ",");
            return;
        }
        for(int i=0; i<10; i++){
            pincodeGenerator(range -1, result + i);
        }
        // pincodeGenerator(range - 1, result + "0");
        // pincodeGenerator(range - 1, result + "1");
        // pincodeGenerator(range - 1, result + "2");
        // pincodeGenerator(range - 1, result + "3");
        // pincodeGenerator(range - 1, result + "4");
        // pincodeGenerator(range - 1, result + "5");
        // pincodeGenerator(range - 1, result + "6");
        // pincodeGenerator(range - 1, result + "7");
        // pincodeGenerator(range - 1, result + "8");
        // pincodeGenerator(range - 1, result + "9");
    }
    public static void main(String[] args) {
        int range = 4;
        pincodeGenerator(range, " ");
    }
}
