class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> s=new HashSet<>();
        int c=0;
        for(char i:jewels.toCharArray()){
            s.add(i);
        }
        for(char ch:stones.toCharArray()){
            if(s.contains(ch)){
                c++;
            }
        }
        return c;
    }
}