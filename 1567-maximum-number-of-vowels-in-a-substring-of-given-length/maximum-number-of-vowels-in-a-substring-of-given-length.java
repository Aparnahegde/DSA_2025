class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> st=new HashSet<>();
        int mv=0;
        int w=0;
        st.add('a');st.add('e');st.add('i');st.add('o');st.add('u');

        for(int i=0;i<k;i++){
            if(st.contains(s.charAt(i))){
                w++;
            }
        }
        mv=w;
        for(int i=k; i<s.length();i++){
            if(st.contains(s.charAt(i-k))){
                w--;
            }
            if(st.contains(s.charAt(i))){
                w++;
            }

            mv=Math.max(mv,w);

            if(mv==k){
                return mv;
            }
        }
        return mv;
    }
}