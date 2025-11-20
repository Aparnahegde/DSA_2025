class Solution {
    public int hammingWeight(int n) {
        int count=0;
        int r=0;
        while(n>0){
            r=n%2;
            if(r==1){
                count++;
            }
            n=n/2;
        }
        return count;
    }
}