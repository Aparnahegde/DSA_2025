class Solution {
    public int reverse(int x) {
        long r=0;
        long s=0;
       
       int sign= x<0 ?-1:1;
         x = Math.abs(x);
        while(x>0){
            r=x%10;
           
            s=s*10+r;
             if (s > Integer.MAX_VALUE) return 0;
            x=x/10;
        }
        return (int)(s*sign);
    }
}