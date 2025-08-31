class Solution {
    public int maxArea(int[] height) {
       int l=0;
       int r=height.length-1;
       int max=0;

       while(l<r){
        int min=Math.min(height[l],height[r]);
        int a=min*(r-l);
        max=Math.max(max,a);

        if(height[r]<height[l]) {
            r--;
        }
        else{
            l++;
        }
       } 
       return max;
    }
}