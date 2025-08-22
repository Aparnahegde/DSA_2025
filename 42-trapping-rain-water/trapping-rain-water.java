class Solution {
    public int trap(int[] height) {
        // int res=0;
        // int tw=0;
        // int sw=0;
        // for(int i=1;i<height.length-1;i++){
        //     int lb=height[i];
        //     for(int j=0;j<i;j++){
        //         if(height[j]>lb){
        //             lb=height[j];
        //         }
        //     }
        //     int rb=height[i];
        //     for(int j=i+1;j<height.length;j++){
        //         if(height[j]>rb){
        //             rb=height[j];
        //         }
        //     }
        //     tw=Math.min(lb,rb);
        //     sw=tw-height[i];
        //     res+=sw;
        // }
        // return res;

        int res=0;
        int n=height.length;
        int[] lb=new int[n];
        int[] rb=new int[n];
        lb[0]=height[0];
        rb[n-1]=height[n-1];
        for(int i=1;i<n-1;i++){
            lb[i]=Math.max(lb[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            rb[i]=Math.max(rb[i+1],height[i]);
        }
        for(int i=1;i<n-1;i++){
            res+=Math.min(lb[i],rb[i])-height[i];
        }

        return res;








    }
}