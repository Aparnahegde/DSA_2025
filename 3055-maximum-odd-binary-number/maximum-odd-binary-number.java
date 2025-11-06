class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cOne=0;
        int cZero=0;
        for(char c: s.toCharArray()){
            if(c=='0'){
                cZero++;
            }else{
                cOne++;
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append("1");
        cOne--;

        while(cZero>0){
            sb.append("0");
            cZero--;
        }
        while(cOne>0){
            sb.append("1");
            cOne--;
        }
        return sb.reverse().toString();
    }
}