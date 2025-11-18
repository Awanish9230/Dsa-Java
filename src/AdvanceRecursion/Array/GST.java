package AdvanceRecursion.Array;

public class GST {
    static int[] getPricesWithGst(int prices[], int index){
        if(index == prices.length){
            int gst[] = new int[prices.length];
            return gst;
        }
        
        int gst[] = getPricesWithGst(prices, index + 1);
        gst[index] = prices[index] +(int) (prices[index] *.18);
        return gst;

    }
    public static void main(String[] args) {
        int prices[] = {100,200,300,400,500};
        int newPrices[] = getPricesWithGst(prices, 0);

        for(int p : newPrices){
            System.out.println(p);
        }
    }
}
