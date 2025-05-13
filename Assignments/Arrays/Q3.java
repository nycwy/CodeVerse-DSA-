public class Q3 {
    public static int maximum(int prices[]){
        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            int profit = 0;
            if(prices[i] < bp){
                bp = prices[i];
            }else{
                profit = prices[i] - bp;
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7, 6, 4, 3, 1};
        // int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maximum(prices));
    }
}
