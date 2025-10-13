class Solution {
    public int search(int[] nums, int target) {
        int f=0;
        int l=nums.length-1;
        while(f<=l){
            int m=f+(l-f)/2;
            if(nums[m]==target){
                return m;
            }
            if(target>nums[m]){
                f=m+1;
            }
            else{
                l=m-1;
            }
        }
        return -1;
    }
}