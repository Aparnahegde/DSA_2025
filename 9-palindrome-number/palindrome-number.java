class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=x;
        int pal=0;
        while(temp>0){
            int rem=temp%10;
            pal=pal*10+rem;
            temp/=10;
        }
      

        return pal==x;
    }
}