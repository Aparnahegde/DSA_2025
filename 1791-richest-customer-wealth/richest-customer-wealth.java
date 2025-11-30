class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=0;
            int m=accounts[i].length;
            for(int j=0;j<m;j++){
                sum+=accounts[i][j];
            }
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}