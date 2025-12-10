class Solution {
    public boolean halvesAreAlike(String s) {
      Set<Character> vow = Set.of('a','e','i','o','u','A','E','I','O','U');
        int v=0;
        for(int i=0;i<(s.length()/2);i++){
            if(vow.contains(s.charAt(i))){
                v++;
            }
        }
        for(int i=(s.length()/2);i<s.length();i++){
            if(vow.contains(s.charAt(i))){
                v--;
            }
        }

        return (v==0)?true:false;
    }
}