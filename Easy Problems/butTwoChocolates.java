class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1=100;
        int min2=100;
       for(int i=0;i<prices.length;i++)
       {
            if(prices[i]<=min1)
            {
                min2=min1;
                min1=prices[i];
            }
            if(prices[i]>min1 && prices[i]<min2)
            {
                min2=prices[i];
            }
       }
       int sum=min1+min2;
       if(sum<=money)
       {
        return money-sum;
       }
       return money;
    }
}