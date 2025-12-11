class Solution {
    public boolean judgeCircle(String moves) {
        int cV=0;
        int cH=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                cV++;
            }
            if(c=='D'){
                cV--;
            }
            if(c=='L'){
                cH++;
            }
            if(c=='R'){
                cH--;
            }
        }
        return (cV==0&&cH==0);
    }
}