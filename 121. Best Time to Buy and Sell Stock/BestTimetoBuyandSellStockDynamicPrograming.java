class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int buy = prices[0];

        for(int sell : prices){
            res= Math.max(res,sell-buy);
            buy= Math.min(buy,sell);
        }
      return  res;
    }
}
//time - O(n) space - O(1)
