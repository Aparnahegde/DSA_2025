class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();

        for(char d:num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>d){
                st.pop();
                k--;
            }
            st.push(d);
        }

        //If stack has 1,2,3  k=2  then pop last elements

        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
     StringBuilder sb=new StringBuilder();
     while(!st.isEmpty()){
        sb.append(st.pop());
     }
     sb.reverse();

     //if "000123" is sb

     while(sb.length()>0 && sb.charAt(0)=='0'){
        sb.deleteCharAt(0);
     }

     return sb.length()>0?sb.toString() :"0";



    }
}