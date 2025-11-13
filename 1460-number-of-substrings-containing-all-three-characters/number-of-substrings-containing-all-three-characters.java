class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int[] count=new int[3];
        int res=0,i=0;

        for(int left=0;left<n;left++){
            count[s.charAt(left)-'a']++;
            while(count[0]>0&&count[1]>0&&count[2]>0){
                res+=n-left;
                count[s.charAt(i)-'a']--;
                i++;
            }
        }
        return res;
    }
}