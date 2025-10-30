class Solution {
    public int[] rearrangeArray(int[] nums) {
       int pi=0,ni=1;
    int[] c=new int[nums.length];
       for(int i:nums){
        if(i>0){
            c[pi]=i;
            pi+=2;
        }
        else{
            c[ni]=i;
            ni+=2;
        }
            
        }
        return c;
       }
    
}