class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
    int count=0;
    int coin=coins;
    
    for(int i:costs){
        if(i<=coin){
             count++;
            coin= coin-i;
             i++;
    }
    }
     return count;
}
}
