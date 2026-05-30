class Solution {
    public int maxProfit(int[] prices) {
        int x=Integer.MAX_VALUE;
        int y=0;

        for(int i : prices){
          if(i < x){
            x = i;
          }

          int profit = i - x;

          if(profit > y){
            y = profit;
          }
    }
    return y;
}
}