class Solution {
    public int maxProfit(int[] price) {
        //test
        int min=price[0];
        int maxProfit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]<min){
                min=price[i];
            }
            int p=price[i]-min;
            if(p>maxProfit){
                maxProfit=p;
            }
        }
        return maxProfit;
    }
}